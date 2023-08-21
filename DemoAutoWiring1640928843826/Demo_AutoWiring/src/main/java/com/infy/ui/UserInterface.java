package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.configuration.SpringConfig;
import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

public class UserInterface {//tester,runner
	
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 
	


	public static void main(String[] args) throws Exception {
		Environment environment=null;
		//ApplicationContext applicationContext =null;
		try{
			AnnotationConfigApplicationContext x= new AnnotationConfigApplicationContext(SpringConfig.class);
			environment=x.getEnvironment();
			CustomerLoginController customerLoginController = x.getBean(CustomerLoginController.class);
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("monica");
			customerLogin.setPassword("monica123");

			String s=customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty(s));
		}catch(InfyBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}

	}
}
