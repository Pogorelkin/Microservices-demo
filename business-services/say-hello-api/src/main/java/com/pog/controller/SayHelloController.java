package com.pog.controller;

import com.pog.api.GiveHelloAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say-hello")
public class SayHelloController {

    @Autowired
    GiveHelloAPI giveHelloAPI;


    @GetMapping("/hello")
    public String sayHelloToSomeone(){
        return giveHelloAPI.sayHello();
    }
}
