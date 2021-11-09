package com.bridgelabz.spring.greetingapp.controller;

import com.bridgelabz.spring.greetingapp.service.Greeting;
import com.bridgelabz.spring.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping({"/", ""})
    public String getWelcome() {
        return greetingService.getHelloMessage();
    }

}