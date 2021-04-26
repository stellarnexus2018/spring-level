package ru.master.springlevel;

import org.springframework.stereotype.Component;

@Component
public class DanceMusic implements Music {
  private String[] darr = {"тыц-тыц", "трям-трям", "були-були"};

  @Override
  public String[] getSong() {
    return darr;
  }
}