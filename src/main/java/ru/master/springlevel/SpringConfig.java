package ru.master.springlevel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {
  @Bean
  public DanceMusic danceMusic(){
    return new DanceMusic();
  }

  @Bean
  public MetalMusic metalMusic(){
    return new MetalMusic();
  }

  @Bean
  public MusicPlayer musicPlayer() {
    return new MusicPlayer(danceMusic(), metalMusic());
  }

  @Bean
  public Computer computer() {
    return new Computer(musicPlayer());
  }
}