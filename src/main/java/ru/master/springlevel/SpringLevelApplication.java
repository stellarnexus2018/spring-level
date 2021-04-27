package ru.master.springlevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLevelApplication {
	public static void main(String[] args) {
		//SpringApplication.run(SpringLevelApplication.class, args);
		//ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext cpxac = null;

		//Music music = cpxac.getBean("danceMusic", Music.class);
		//Music music1 = cpxac.getBean("metalMusic", Music.class);
		//MusicPlayer musicPlayer = cpxac.getBean("musicPlayer", MusicPlayer.class);
		//musicPlayer.playSound();

		/*Computer c = cpxac.getBean("computer", Computer.class);
		System.out.println(c);*/

		//MusicPlayer mp = cpxac.getBean("musicPlayer", MusicPlayer.class);
		//System.out.println(mp.getSongName());
		//System.out.println(mp.getVolume());

//		DanceMusic dm1 = cpxac.getBean("danceMusic", DanceMusic.class);
//		DanceMusic dm2 = cpxac.getBean("danceMusic", DanceMusic.class);
		//System.out.println(dm1 == dm2);


		try {
			cpxac = new AnnotationConfigApplicationContext(SpringConfig.class);

		} finally {
			cpxac.close();

		}





	}
}