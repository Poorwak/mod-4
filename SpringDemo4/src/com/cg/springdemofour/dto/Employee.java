package com.cg.springdemofour.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.springdemofour.service.IEmployeeService;

@Component("emp")
public class Employee 
{
	@Autowired
	IEmployeeService employeeservice;
	
	
	public void getDetails()
	{
		System.out.println("Welcome to Spring Annotation.");
		employeeservice.getData();
		
	}
}
