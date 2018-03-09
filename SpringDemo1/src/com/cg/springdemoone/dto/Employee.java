package com.cg.springdemoone.dto;

public class Employee 
{
	int empId;
	String empName;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/*@Override
	public void getAllDetails() 
	{
		System.out.println("Employee ID is: "+empId+ "\n Employee Name is: "+empName);
		
	}*/
	
	public void getAllEmployee()
	{
		System.out.println("Employee ID is: "+empId+ "\n Employee Name is: "+empName);
	}

}
