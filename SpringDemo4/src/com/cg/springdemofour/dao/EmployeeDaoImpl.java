package com.cg.springdemofour.dao;

import org.springframework.stereotype.Component;

@Component("employeedao")
public class EmployeeDaoImpl implements IEmployeeDao
{

	@Override
	public void getData() 
	{
		System.out.println("In Dao.");
		
	}

}
