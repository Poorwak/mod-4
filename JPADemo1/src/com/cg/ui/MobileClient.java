package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.dto.Mobile;

public class MobileClient 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		Mobile mobile=new Mobile();
		mobile.setMobileid(1005);
		mobile.setMname("MotoG 5");
		mobile.setPrice(15000);
		mobile.setQty(10);
		
		em.getTransaction().begin();
		em.persist(mobile);						//persist means data insert ho raha hai
		em.getTransaction().commit();
		System.out.println("1 record of mobile inserted");
		
	}
}
