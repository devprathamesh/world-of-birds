package dev.prathamesh.worldofbirds.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("german")
public class GreetingServiceGerman implements GreetingService{

    @Override
    public String sayHello(String name) {
        return "Halo " + name;
    }
}
