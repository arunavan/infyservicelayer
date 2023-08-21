package com.infy.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service (value="A")
//@Component
public class CustomerLoginServiceImpl implements CustomerLoginService {
//1
	//@Autowired //implicit di   attribute autowiring
	private CustomerLoginRepository customerLoginRepository;//getBean
	
	//2
	@Autowired
	public CustomerLoginServiceImpl(CustomerLoginRepository customerLoginRepository) {
		super();
		this.customerLoginRepository = customerLoginRepository;
	}
	
	//3
	/*
	 * public CustomerLoginRepository getCustomerLoginRepository() { return
	 * customerLoginRepository; }
	 * 
	 * @Autowired public void setCustomerLoginRepository(CustomerLoginRepository
	 * customerLoginRepository) { this.customerLoginRepository =
	 * customerLoginRepository; }
	 */



	

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		try {
			String toRet = null;
			CustomerLoginDTO customerLoginFromDao = customerLoginRepository
					.getCustomerLoginByLoginName(customerLogin.getLoginName());
			if (customerLogin.getPassword().equals(customerLoginFromDao.getPassword())){
				toRet = "SUCCESS";
			}else{
				throw new InfyBankException("Service.WRONG_CREDENTIALS");
			}
			return toRet;
			
		}catch(InfyBankException exception) {
			Log LOGGER = LogFactory.getLog(this.getClass()); 
			LOGGER.error(exception.getMessage(),exception);
			throw exception;
		}

	}
}
