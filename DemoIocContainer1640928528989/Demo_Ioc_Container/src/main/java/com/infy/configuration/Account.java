package com.infy.configuration;

public class Account {
	Integer id;
	String bankName;
	@Override
	public String toString() {
		return "Account [id=" + id + ", bankName=" + bankName + "]";
	}
	public Account(Integer id, String bankName) {
		super();
		this.id = id;
		this.bankName = bankName;
	}
	

}
