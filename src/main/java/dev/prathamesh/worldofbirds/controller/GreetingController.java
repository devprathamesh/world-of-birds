package dev.prathamesh.worldofbirds.controller;

import dev.prathamesh.worldofbirds.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(path = "greetings/{name}")
    public String sayHello(@PathVariable(value = "name") String name){
        return greetingService.sayHello(name);
    }
}
