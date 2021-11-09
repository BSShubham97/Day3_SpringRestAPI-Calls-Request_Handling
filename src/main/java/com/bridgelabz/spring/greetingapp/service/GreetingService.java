package com.bridgelabz.spring.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String getHelloMessage() {
        return "Hello I am Mark Shelby";
    }
}
