package com.sergTito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer2.name}")
    private String name;
    @Value("${musicPlayer2.volume}")
    private int volume;

    private final Music music1;
    private final Music music2;
    private Genre genre;




    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public String playMusic() {
//        return "playing:" + music1.getSong() + ", " + music2.getSong();
//    }


    public String playMusic(Genre genre) {

        if (genre == Genre.ROCK){
            return music1.getSong();
        }else if (genre == Genre.CLASSICAL){
            return music2.getSong();
        }else return "Такого жанра нет";
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
