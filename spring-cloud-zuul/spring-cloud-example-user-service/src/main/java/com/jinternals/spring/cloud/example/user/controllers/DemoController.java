package com.jinternals.spring.cloud.example.user.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("#{environment.instanceId}")
    private String instanceId;


    @GetMapping
    DemoMessage getMessage() {
        return new DemoMessage("Hello from instance : "+ instanceId);
    }

    static class DemoMessage {

        private String message ;

        public DemoMessage(String message){

            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
