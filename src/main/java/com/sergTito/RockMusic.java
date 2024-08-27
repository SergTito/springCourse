package com.sergTito;


import org.springframework.stereotype.Component;

import java.util.Random;

public class RockMusic implements Music {


    @Override
    public String getSong() {
        return addSongs();
    }

    public String addSongs() {
        String s;

        Random random = new Random();


        String[] listClassicMusic = new String[]{
                "Stairway to Heaven by Led Zeppelin",
                "Bohemian Rhapsody by Queen",
                "Hotel California by Eagles",
        };
        int randomNextInt = random.nextInt(listClassicMusic.length);
        s = listClassicMusic[randomNextInt];

        return s;
    }
}
