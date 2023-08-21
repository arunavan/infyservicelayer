package com.infy.bean;

import org.springframework.stereotype.Component;

//@Component
public class Product {
	Integer id;
	String name;
	public Product() {}
	

	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getProduct() {
		return "Good prpoduct";
	}

}
