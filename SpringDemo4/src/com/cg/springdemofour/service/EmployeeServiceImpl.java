package com.cg.springdemofour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.springdemofour.dao.IEmployeeDao;

@Component("employeeservice")
public class EmployeeServiceImpl implements IEmployeeService
{
	@Autowired
	IEmployeeDao employeedao;
	
	@Override
	public void getData() 
	{
		System.out.println("In Service");
		employeedao.getData();
	}
	
}
