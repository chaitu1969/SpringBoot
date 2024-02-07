package com.chaitu.Springcoredemo.config;

import com.chaitu.Springcoredemo.common.Coach;
import com.chaitu.Springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
