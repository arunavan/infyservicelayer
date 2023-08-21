package com.infy.bean;

import org.springframework.stereotype.Component;

@Component// @Service, @Repository ,@Controller
public class WelcomeBean {
	public String printWelcome() {
		return "Welcome to Spring";
	}
}
