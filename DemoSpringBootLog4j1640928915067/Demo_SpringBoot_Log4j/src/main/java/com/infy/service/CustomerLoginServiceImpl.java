package com.infy.service;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;

	@Override
	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		Log LOGGER = LogFactory.getLog(this.getClass()); 
		LOGGER.info("inside service ...");
	
		try{
			String toRet = null;
			CustomerLoginDTO customerLoginFromRepository = customerLoginRepository
					.getCustomerLoginByLoginName(customerLogin.getLoginName());
			if (customerLogin.getPassword().equals(customerLoginFromRepository.getPassword())){
				toRet = "SUCCESS";
			}else{
				throw new InfyBankException("Service.WRONG_CREDENTIALS");
			}
			LOGGER.info("inside end of  service ...");
			
			return toRet;
		}catch(InfyBankException exception){
			Log LOGGER1 = LogFactory.getLog(this.getClass()); 
			LOGGER1.error(exception.getMessage(),exception);
			throw exception;
		}
	}
}
