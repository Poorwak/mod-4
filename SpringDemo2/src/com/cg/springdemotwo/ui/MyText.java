package com.cg.springdemotwo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemotwo.dto.EmployeeDetails;

public class MyText {

	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDetails e=(EmployeeDetails) app.getBean("emp");
		e.getAllEmployeeDetails();

	}

}
