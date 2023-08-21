package com.infy.validator;

import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;

public class Validator {

	public static void validate(TeamMemberDTO teamMember) throws AbcException {
	
	}

	public static Boolean validateEmployeeId(Integer employeeId) throws AbcException {
		Boolean flag=false;
		if (employeeId.toString().matches("\\d{6}")) {
		    flag=true;
		}
		return flag;
	}
}
