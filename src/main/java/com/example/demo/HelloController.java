package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	

	@GetMapping("/")
	public String getHello1() {
		return "hello world home";
	}

	@GetMapping("/hello")
	public String getHello() {
		return "hello world";
	}

	
}
