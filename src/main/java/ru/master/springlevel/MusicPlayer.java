package ru.master.springlevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
  private Music music;
  private Music music1;
  Random r = new Random();
  int bound = 3;

  @Autowired
  public MusicPlayer(@Qualifier("metalMusic") Music music,
                     @Qualifier("danceMusic") Music music1) {
    this.music = music;
    this.music1 = music1;
  }

  public void playSound(){
    System.out.println("Плеер играет: " + music.getSong()[r.nextInt(bound)]);
  }

  public String playMasterSound(selectorSong sel_song){
    return "Плеер играет: " +
        (sel_song.equals(selectorSong.METAL) ? music.getSong()[r.nextInt(bound)]
        : music1.getSong()[r.nextInt(bound)]);
  }
}