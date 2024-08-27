package com.sergTito.hw;

import com.sergTito.ClassicalMusic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("HW.properties")
public class SpringConfigHW {

    @Bean("classical")
    public MusicHW ClassicalMusicHW() {
        return new ClassicalMusicHW();
    }

    @Bean("rock")
    public MusicHW RockMusicHW() {
        return new RockMusicHW();
    }

    @Bean("rap")
    public MusicHW RapMusicHW() {
        return new RapMusicHW();
    }

    @Bean("musicList")
    public List<MusicHW> musicListHW() {
        return Arrays.asList(ClassicalMusicHW(), RockMusicHW(), RapMusicHW());
    }

    @Bean
    public MusicPlayerHW musicPlayerHW() {
        return new MusicPlayerHW(musicListHW());
    }

//    @Bean
//    public ComputerHW computerHW() {
//        return new ComputerHW(musicPlayerHW());
//    }

}
