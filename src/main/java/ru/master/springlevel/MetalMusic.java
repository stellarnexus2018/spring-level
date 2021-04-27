package ru.master.springlevel;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MetalMusic implements Music {
  private String[] marr = {"дрдрдррррр", "гггжжжжтддддд", "аааааа@#$$$#@"};

  @PostConstruct
  public void init(){
    System.out.println(this.getClass().getName() + " class init");
  }

  @PreDestroy
  public void destr(){
    System.out.println(this.getClass().getName() + " class destroy");
  }


  @Override
  public String[] getSong() {
    return marr;
  }
}