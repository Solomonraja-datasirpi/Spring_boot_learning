package com.solo.demospringtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringTestingApplication.class, args);
	}
	@GetMapping("/")
	public String hello(){
		return "Helle world";
	}

}

