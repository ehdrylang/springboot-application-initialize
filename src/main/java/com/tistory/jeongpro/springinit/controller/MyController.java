package com.tistory.jeongpro.springinit.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    public void hello(){
        System.out.println("Hello MyController");
    }
}
