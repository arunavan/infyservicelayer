package com.infy.ui;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.Course;
import com.infy.bean.Customer;
import com.infy.bean.Product;
import com.infy.configuration.Account;
import com.infy.configuration.SpringConfig;
public class App  //BEanFactory vs ApplicationContext , @Bean vs @Component
{  public static void main( String[] args ) {
	
//	Course c=new Course();
//	System.out.println(c);

	
    	//Products p=new Products(10,"Ball");//DI, Heavy weight, wthout spring
    	//System.out.println(p);
    	//IOC -XML
    //	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("E:\\Infosys\\ServiceLayer\\App1\\src\\main\\java\\beans.xml"));
    //	Product p1=(Product)factory.getBean("p");
    //	System.out.println(p1);
    	//IOC- Javabasedconfig
    	AnnotationConfigApplicationContext iocContainer = new AnnotationConfigApplicationContext(SpringConfig.class);
    //	Course c=(Course)iocContainer.getBean(Course.class); //singleton scope, manage scope
    //	System.out.println(c.getClass());
    //	System.out.println(c.hashCode());
    //	Course c1=(Course)iocContainer.getBean(Course.class);
    //	System.out.println(c1.hashCode());
    //	Course c2=(Course)iocContainer.getBean(Course.class);
    //	System.out.println(c2.hashCode());
    	
    //	Customer cc1=iocContainer.getBean(Customer.class);
    //	System.out.println(cc1);
    	
    	Product p=iocContainer.getBean(Product.class);//DependencyInjection
    	System.out.println(p.getProduct());
    	
    	//Account a1=(Account)iocContainer.getBean("a");
    	Account a1=iocContainer.getBean(Account.class);
    	System.out.println(a1);
    	iocContainer.close();
    	
    	
    	
    //	Products p1=(Products)applicationContext.getBean(Products.class);
    	//System.out.println(p1);
    	//System.out.println(p1.hashCode());
    	//System.out.println(p1.id+"  "+p1.name);
    	//Account a1=(Account)applicationContext.getBean("a");  //Account.class
    	//System.out.println(a1);
    	//applicationContext.close();  //IOC container is lcosed 
    	//applicationContext.
    }
}
