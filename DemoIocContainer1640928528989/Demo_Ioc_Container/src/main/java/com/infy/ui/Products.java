package com.infy.ui;

public class Products {
	int id;
	String name;
	Products() {
		
	}
	public Products(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	

}
