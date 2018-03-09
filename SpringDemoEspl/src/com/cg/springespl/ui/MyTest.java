package com.cg.springespl.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springespl.dto.PrintEmployeeDetail;

public class MyTest {

	public static void main(String[] args) 
	{
		ApplicationContext app= new ClassPathXmlApplicationContext("spring.xml");
		PrintEmployeeDetail pemp=(PrintEmployeeDetail) app.getBean("print");
		pemp.getAllDetail();
	}

}
