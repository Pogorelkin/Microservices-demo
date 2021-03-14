package com.pog.controller;

import com.pog.api.GiveHelloAPI;
import com.pog.service.GetNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/give-hello")
@RestController
public class HelloAPIController implements GiveHelloAPI {

    private final GetNumberService getNumberService;

    public HelloAPIController(GetNumberService getNumberService) {
        this.getNumberService = getNumberService;
    }

    @Override
    @GetMapping("/")
    public String sayHello() {
        return "Ow, hello! I'm number " + getNumberService.getNumberOfService() + " :)" ;
    }
}
