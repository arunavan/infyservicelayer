package com.infy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbcToTraineeApplication implements CommandLineRunner{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AbcToTraineeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		addProject();
		//getProjectDetails();
	}

	public void addProject() {
		

	}


	public void getProjectDetails() {

	}

}