package com.infy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.service.CustomerLoginService;

@Controller(value="customerLoginController")
public class CustomerLoginController {

	@Autowired
	private CustomerLoginService customerLoginService;

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		
		Log LOGGER = LogFactory.getLog(this.getClass()); 
		LOGGER.info("inside constroller..");
		return customerLoginService.authenticateCustomer(customerLogin);
	}
}
