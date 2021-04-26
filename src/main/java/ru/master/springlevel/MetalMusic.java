package ru.master.springlevel;

import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music {
  private String[] marr = {"дрдрдррррр", "гггжжжжтддддд", "аааааа@#$$$#@"};

  @Override
  public String[] getSong() {
    return marr;
  }
}