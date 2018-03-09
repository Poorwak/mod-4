package com.cg.springdemoone.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemoone.dto.Details;
import com.cg.springdemoone.dto.Employee;
import com.cg.springdemoone.dto.Shape;

public class MyTest {

	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
//		Shape sp=(Shape) app.getBean("trian");
//		sp.getShape();	
//		
//		Shape sp1=(Shape) app.getBean("cir");
//		sp.getShape();
//		
//		Details dt=(Details) app.getBean("emp");
//		dt.getAllDetails();

		Employee emp=(Employee) app.getBean("emp");
		emp.getAllEmployee();
	}

}
