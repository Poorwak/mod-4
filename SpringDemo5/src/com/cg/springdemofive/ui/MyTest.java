package com.cg.springdemofive.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemofive.dto.Employee;

public class MyTest {

	public static void main(String[] args) 
	{
		ApplicationContext app= new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee) app.getBean("empl");
		e.getAllData();

	}

}
