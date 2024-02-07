package com.chaitu.Springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Contructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Will get Data After workout";
    }
}
