package gatis.springframework.di.services.impl;

import gatis.springframework.di.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
