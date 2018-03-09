package com.cg.springdemofive.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empl")
public class Employee 
{
	@Value("${uid}")
	int empId;
	@Value("${uname}")
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
	
	public void getAllData()
	{
		System.out.println("Id is: "+empId);
		System.out.println("Name is: "+empName);
	}
}
