package com.sergTito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;



    public Computer(MusicPlayer musicPlayer) {
        this.id =1;
        this.musicPlayer = musicPlayer;

    }

//   @Override
//    public String toString() {
//        return "Computer" + id + "\n "+ musicPlayer.playMusic();
//    }



}
