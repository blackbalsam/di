package gatis.springframework.di.services.impl;

import gatis.springframework.di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
