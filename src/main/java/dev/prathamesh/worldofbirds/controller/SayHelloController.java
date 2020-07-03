package dev.prathamesh.worldofbirds.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
class SayHelloController{

	@RequestMapping(path = "sayHello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable(value = "name") String name){
		return "Hello " + name;
	}

}