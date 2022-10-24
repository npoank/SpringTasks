package org.andrew.springtasks;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music musicRock;
    private Music musicClass;

    public MusicPlayer(@Qualifier("rock") Music musicRock, @Qualifier("classic") Music musicClass) {
        this.musicRock = musicRock;
        this.musicClass = musicClass;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == Genre.CLASSIC) {
            System.out.println("Playing " + musicClass.getSong().get(randomNumber));
        } else {
            System.out.println("Playing " + musicRock.getSong().get(randomNumber));
        }
    }
}
