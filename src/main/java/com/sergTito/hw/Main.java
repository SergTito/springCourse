package com.sergTito.hw;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigHW.class);

        MusicPlayerHW musicPlayerHW = context.getBean("musicPlayerHW",MusicPlayerHW.class);
        System.out.println(musicPlayerHW.getName()+" , " + musicPlayerHW.getVolume());

        musicPlayerHW.playRandomMusic();







        context.close();


    }
}
