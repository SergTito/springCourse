package com.sergTito.hw;

import java.util.Random;

public class RapMusicHW implements MusicHW  {

    public String getSong() {
        return addSongs();
    }

    public String addSongs() {
        String s;
        Random random = new Random();

        String[] listClassicMusic = new String[]{
                "50 cent Candy shop",
                "Eminem 8 miles",
                "Snoopy dog steel",
        };
        int randomNextInt = random.nextInt(listClassicMusic.length);
        s = listClassicMusic[randomNextInt];

        return s;
    }
}
