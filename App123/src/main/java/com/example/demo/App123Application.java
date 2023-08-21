package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //1.EnableAuto   2.Config   3.Componentscan
public class App123Application //implements CommandLineRunner
{//bootstrapstap java class,deployment starts, entry point sb
	public static final Log LOGGER = LogFactory.getLog(App123Application.class); 
	public static void main(String[] args) {
		SpringApplication.run(App123Application.class, args);
	}
	/*
	 * @Override public void run(String... args) throws Exception {
	 * LOGGER.info("Welcome to CommandLineRunner"); }
	 */

}
