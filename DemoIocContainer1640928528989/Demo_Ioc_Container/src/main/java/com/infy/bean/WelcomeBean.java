package com.infy.bean;

import org.springframework.stereotype.Component;
//@Controller  , @Service  @Repository
@Component   //generic stiero type    ,@Controller   
public class WelcomeBean {
	String msg;
	public String printWelcome() {
		return "Welcome to Spring";
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
