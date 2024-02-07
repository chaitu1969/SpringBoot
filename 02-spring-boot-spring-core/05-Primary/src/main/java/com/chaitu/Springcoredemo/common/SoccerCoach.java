package com.chaitu.Springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "run around ground by 5 rounds for legs and body activeness :)";
    }

}
