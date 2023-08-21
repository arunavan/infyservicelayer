package com.infy.service;
import java.util.List;

import com.infy.dto.ProjectDTO;
import com.infy.dto.TeamMemberDTO;
import com.infy.exception.AbcException;
import com.infy.validator.Validator;


public class ProjectServiceImpl implements ProjectService {

	
	@Override
	public Integer addProject(ProjectDTO project) throws AbcException {
		TeamMemberDTO tdto=new TeamMemberDTO();
		tdto.setEmployeeId(123456);
		Validator.validate(tdto);
		return tdto.getEmployeeId();
	}


	
	@Override
	public List<ProjectDTO> getProjectDetails(String technology) throws AbcException {
		
		return null;
	}


	
}
