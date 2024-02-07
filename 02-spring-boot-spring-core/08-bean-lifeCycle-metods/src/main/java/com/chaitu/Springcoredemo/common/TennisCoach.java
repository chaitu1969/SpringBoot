package com.chaitu.Springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In Contructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice daily for 5 Set Matchs";
    }
}
