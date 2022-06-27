package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//get
	//post
	//put
	//delete
	
	//GET HTTP METHOD
	
	
	//http://localhost:8080
	@GetMapping
	public String welcomeMessage() {
		return "Welcome Home: The Spring-Boot 2022";
	}
	 
	//http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

}
