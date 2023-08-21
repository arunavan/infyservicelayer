package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {//tomcat , jetty,undertow -sb
	
	@GetMapping("/loan")
	public String getEmiDetails() {
		return "Monthly EMI would be below10k";
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "welcome to Spring Boot";
	}

}
