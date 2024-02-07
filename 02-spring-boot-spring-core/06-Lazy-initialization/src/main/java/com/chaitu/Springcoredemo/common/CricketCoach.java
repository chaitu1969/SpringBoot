package com.chaitu.Springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Contructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Hitting for 30 mintues :)";
    }
}
