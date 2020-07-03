package dev.prathamesh.worldofbirds.service;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    public String sayHello(String name);
}
