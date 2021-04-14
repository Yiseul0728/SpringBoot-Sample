package com.example.demo.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloSpringBoot {
	@GetMapping(value = "/api")
	public String helloSpring() {
		System.out.println("Hello Spring Boot Controller");
		return "Welcome in Spring Boot";
	}
}
