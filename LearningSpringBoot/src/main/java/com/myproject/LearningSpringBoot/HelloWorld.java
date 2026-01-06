package com.myproject.LearningSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String  sayHello(){
        return "Day 1: Fullstack AI Engine Started by [SHUBHAM]";
    }
}
