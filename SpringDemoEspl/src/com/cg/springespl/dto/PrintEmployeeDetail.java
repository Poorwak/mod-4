package com.cg.springespl.dto;

public class PrintEmployeeDetail 
{
	String fullName;
	double takeHomeSalary;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getTakeHomeSalary() {
		return takeHomeSalary;
	}
	public void setTakeHomeSalary(double takeHomeSalary) {
		this.takeHomeSalary = takeHomeSalary;
	}
	
	public void getAllDetail()
	{
		System.out.println("Full Name: "+fullName);
		System.out.println("Take Home Salary: "+takeHomeSalary);
		
	}
}
