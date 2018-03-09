package com.cg.springdemothree.dto;

public class Project implements EmployeeDetails
{
	int projId;
	String projName;
	
	
	public int getProjId() {
		return projId;
	}


	public void setProjId(int projId) {
		this.projId = projId;
	}


	public String getProjName() {
		return projName;
	}


	public void setProjName(String projName) {
		this.projName = projName;
	}


	@Override
	public void getAllEmployeeDetails() 
	{
		
		
	}

}
