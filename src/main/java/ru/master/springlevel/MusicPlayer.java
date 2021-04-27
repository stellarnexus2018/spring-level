package ru.master.springlevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

public class MusicPlayer {
  private Music music;
  private Music music1;
  Random r = new Random();
  int bound = 3;

  @Value("${musicPlayer.volume}")
  private int volume;

  @Value("${musicPlayer.songName}")
  private String songName;

  public MusicPlayer(@Qualifier("metalMusic") Music music,
                     @Qualifier("danceMusic") Music music1) {
    this.music = music;
    this.music1 = music1;
  }

  @PostConstruct
  public void Init() {
    System.out.println(this.getClass().getName() + " Init");
  }

  @PreDestroy
  public void Deconstruct() {
    System.out.println(this.getClass().getName() + " Deconstruct");
  }

  public int getVolume() {
    return volume;
  }

  public String getSongName() {
    return songName;
  }

  public String playMasterSound(selectorSong sel_song) {
    return "Плеер играет: " +
        (sel_song.equals(selectorSong.METAL) ? music.getSong()[r.nextInt(bound)]
            : music1.getSong()[r.nextInt(bound)]);
  }
}