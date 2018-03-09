package com.cg.springdemothree.dto;

import java.util.List;

public class Employee implements EmployeeDetails
{
	int empId;
	String empName;
	
	List<Project> pro;
	
	
//	public int getEmpId() {
//		return empId;
//	}
//
//
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//
//
//	public String getEmpName() {
//		return empName;
//	}
//
//
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//
//
//	public Project getProOne() {
//		return proOne;
//	}
//
//
//
//	public void setProOne(Project proOne) {
//		this.proOne = proOne;
//	}
//
//
//
//	public Project getProTwo() {
//		return proTwo;
//	}
//
//
//
//	public void setProTwo(Project proTwo) {
//		this.proTwo = proTwo;
//	}



	@Override
	public void getAllEmployeeDetails() 
	{
		System.out.println("Employee ID is: "+empId);
		System.out.println("Employee Name is: "+empName);
		for (Project project:pro)
		{
			System.out.println("Project Id is: "+project.getProjId());
			System.out.println("Project Name is: "+project.getProjName());
			
		}
		
//		System.out.println("ProjectOne Id is: "+pro.getProjId());
//		System.out.println("ProjectOne Name is: "+proOne.getProjName());
//		
//		System.out.println("ProjectTwo Id is: "+proTwo.getProjId());
//		System.out.println("ProjecTwo Name is: "+proTwo.getProjName());
	}


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


	public List<Project> getPro() {
		return pro;
	}


	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	
}
