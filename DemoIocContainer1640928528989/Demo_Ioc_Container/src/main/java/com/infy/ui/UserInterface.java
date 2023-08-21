package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.Customer;
import com.infy.bean.Product;
import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;

public class UserInterface {
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 

	public static void main(String[] args) {

		// BeanFactory applicationContext=new XMLBeanFactory(new FileSystemResource());
		//AnnotationConfig
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("container is ready");
		  WelcomeBean		welcomeBean = applicationContext.getBean(WelcomeBean.class);
		  
		//  WelcomeBean w=new WelcomeBean();
		 LOGGER.info(welcomeBean.printWelcome());
		 welcomeBean.setMsg("Good Morning..");
		 System.out.println(welcomeBean.getMsg());
		 
		 Customer c=applicationContext.getBean(Customer.class);
		 System.out.println(c);
		 
			
		//	  Customer c=applicationContext.getBean(Customer.class);
			  
		//	  System.out.println(c); 
			  applicationContext.close();
			  System.out.println("container closed");
			  
		/*
		 * Product p=new Product(); WelcomeBean w=new WelcomeBean();
		 */
	}
}
