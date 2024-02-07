package com.chaitu.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting properties for : coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for coach name
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: "+ coachName + ", Team name: "+ teamName;
    }



    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // endpoint for "Workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 5K";
    }

    // a new Endpoint for Fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky Day";
    }


}
