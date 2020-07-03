package dev.prathamesh.worldofbirds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WorldOfBirdsApplication {
	public static void main(String[] args) {
		SpringApplication.run(WorldOfBirdsApplication.class, args);
	}
}
