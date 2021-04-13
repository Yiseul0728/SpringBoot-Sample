package com.example.demo.helloWorld;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloSpringBoot {
	@PostMapping(value = "/api")
	public String helloSpring() {
		System.out.println("Hello Spring Boot Controller");
		return "Welcome in Spring Boot";
	}
}
