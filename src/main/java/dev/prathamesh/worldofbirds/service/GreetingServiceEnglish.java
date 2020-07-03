package dev.prathamesh.worldofbirds.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("english")
public class GreetingServiceEnglish implements  GreetingService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
