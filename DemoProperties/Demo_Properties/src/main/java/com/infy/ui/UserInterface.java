package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


import com.infy.configuration.SpringConfig;

public class UserInterface {
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfig.class);
		Environment environment = container.getEnvironment();
		LOGGER.info(environment.getProperty("message"));
		//System.out.println(environment.getProperty("message"));
		LOGGER.info(environment.getProperty("id"));
		//System.out.println(environment.getProperty("pwd"));
		
	}
}
