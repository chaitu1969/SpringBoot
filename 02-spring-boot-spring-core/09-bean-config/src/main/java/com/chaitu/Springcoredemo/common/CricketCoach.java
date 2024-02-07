package com.chaitu.Springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Contructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Hitting for 30 mintues :)";
    }
}
