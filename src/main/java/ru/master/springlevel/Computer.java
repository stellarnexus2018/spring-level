package ru.master.springlevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
  private MusicPlayer mp;

  public Computer(MusicPlayer mp) {
    this.mp = mp;
  }

  @Override
  public String toString() {
    return "На компьютере играет: " + mp.playMasterSound(selectorSong.METAL);
  }
}