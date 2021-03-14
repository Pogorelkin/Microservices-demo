package com.pog.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("give-hello-api")
public interface GiveHelloAPI {
    @GetMapping(value = "/give-hello/")
    String sayHello();
}
