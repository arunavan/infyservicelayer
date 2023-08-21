package com.infy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.infy.bean.Customer;
import com.infy.bean.Product;
import com.infy.ui.Products;
import com.infy.bean.WelcomeBean;
//config class 
@Configuration  //IOC container will hold metat data of  all beans/POJO
//@ComponentScan(basePackages = "com.infy.bean")
public class SpringConfig {
	


  @Bean //bean configuration 
  public Product product() { 
	  return new   Product(10,"Ball123"); 
  }

  
  @Bean(name="a") 
  public Account account() { 
	  return new Account(101,"ICICI");
	  }
 
}

/*
 * @Bean public WelcomeBean welcomeBean() { return new WelcomeBean(); }
 */
 
/*
 * @Bean public Customer customer() { return new Customer(); }
 */