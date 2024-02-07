package com.chaitu.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // endpoint for "Workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 5K";
    }

    // a new Endpoint for Fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky Day";
    }
}
