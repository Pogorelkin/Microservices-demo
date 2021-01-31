package com.pog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GiveHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(GiveHelloApplication.class, args);
    }
}
