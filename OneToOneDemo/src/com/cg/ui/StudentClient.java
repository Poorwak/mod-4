package com.cg.ui;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.dto.Address;
import com.cg.dto.Student;

public class StudentClient {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Address myAdd=new Address(101,"Talwade","Pune",null);
		Address myAdd1=new Address(102,"Hinjewadi","Pune",null);
		
		Set<Address> addSet=new HashSet();
		addSet.add(myAdd);
		addSet.add(myAdd1);

		Student st=new Student();
		st.setRollno(1001);
		st.setSname("Poorwa");
		st.setAddress(addSet);
		
		myAdd.setStu(st);
		myAdd1.setStu(st);
		
		em.getTransaction().begin();
		em.persist(myAdd);//em.persist(st);
		em.getTransaction().commit();
		System.out.println("Student and address record inserted");
		
	}

}
