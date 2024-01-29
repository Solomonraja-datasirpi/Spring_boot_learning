package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {
	@GetMapping("/")
	public String test1(){
		return "welcome Solomon!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}

