package com.pog.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GetNumberService {
    private final int randomInt;

    public GetNumberService() {
        Random random = new Random();
        this.randomInt = random.nextInt();
    }

    public int getNumberOfService(){
        return this.randomInt;
    }
}
