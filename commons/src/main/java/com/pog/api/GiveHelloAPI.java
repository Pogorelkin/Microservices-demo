package com.pog.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("give-hello-api")
public interface GiveHelloAPI {
    @RequestMapping(value = "/helloSomeone", method = RequestMethod.GET)
    String sayHello();
}
