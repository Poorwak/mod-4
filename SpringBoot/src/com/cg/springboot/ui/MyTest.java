package com.cg.springboot.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.springboot.dto.Project;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg.springboot")
public class MyTest 
{
	public static void main(String[] args)
	{
		ApplicationContext app= SpringApplication.run(MyTest.class);
		Project pr=(Project) app.getBean("proj");
		pr.getData();
	}
}
