package com.sergTito.hw;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayerHW {

    @Value("${HW.name}")
    private String name;
    @Value("${HW.volume}")
    private int volume;
    //    private final MusicHW musicHW1;
    //    private final MusicHW musicHW2;
    private List<MusicHW> musicHWList;

    public MusicPlayerHW(List<MusicHW> musicHWList) {
        this.musicHWList = musicHWList;
        System.out.println("Конструктор создан");
    }


    public void playRandomMusic(){
        Random random = new Random();
        System.out.println(musicHWList.get(random.nextInt(musicHWList.size())).getSong());
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

}
