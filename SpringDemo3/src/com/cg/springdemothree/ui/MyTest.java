package com.cg.springdemothree.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemothree.dto.Employee;

public class MyTest 
{

	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee) app.getBean("emp");
		e.getAllEmployeeDetails();
	}

}
