package com.infy.bean;

import org.springframework.stereotype.Component;

@Component
public class Course {  //name, ref, attribute name, datatypes
	Integer id;
	String name;
	public Course() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	
}
