package com.cg.springdemotwo.dto;

public class Employee implements EmployeeDetails
{
	int empId;
	String empName;
	
	
	
	public Employee() 
	{
		super();
		
	}



	public Employee(int empId, String empName) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
	}



	@Override
	public void getAllEmployeeDetails() 
	{
		
		System.out.println("ID is: "+empId);
		System.out.println("Name is: "+empName);
		
	}
	
}
