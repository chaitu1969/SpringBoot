package com.chaitu.RESTService.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

    // add code for end point
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }


}
