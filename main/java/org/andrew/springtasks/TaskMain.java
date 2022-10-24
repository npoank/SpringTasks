package org.andrew.springtasks;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Genre.ROCK);
        musicPlayer.playMusic(Genre.CLASSIC);

        context.close();


    }
}
