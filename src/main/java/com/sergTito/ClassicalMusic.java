package com.sergTito;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {



    public ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my Destroy");
    }
    @Override
    public String getSong() {
        return addClassicalMusic();
    }


    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public String addClassicalMusic(){
        String s;
        Random random = new Random();
        List<String> list = Arrays.asList(
                ("Hungarian Rhapsodic"),
                ("Symphony No. 5"),
                ("The Four Seasons")
        );
        int nextR = random.nextInt(list.size());

        s = list.get(nextR);
        return s;
    }

}
