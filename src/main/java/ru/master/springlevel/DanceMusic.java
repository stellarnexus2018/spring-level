package ru.master.springlevel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DanceMusic implements Music {
  private String[] darr = {"тыц-тыц", "трям-трям", "були-були"};

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
    return darr;
  }
}