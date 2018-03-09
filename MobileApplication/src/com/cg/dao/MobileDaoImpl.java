package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.dto.Mobile;

public class MobileDaoImpl implements MobileDao
{
	EntityManager em;
	public MobileDaoImpl()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		em=emf.createEntityManager();
	}

	@Override
	public void addMobile(Mobile mobile) 
	{
		em.getTransaction().begin();
		em.persist(mobile);
		em.getTransaction().commit();
		
	}

	@Override
	public void updateMobile(Mobile mobile) 
	{
		em.getTransaction().begin();
		em.merge(mobile);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteMobile(Mobile mobile) 
	{
		em.getTransaction().begin();
		em.remove(mobile);
		em.getTransaction().commit();
		
	}

	@Override
	public Mobile findMobile(int mid) 
	{
		Mobile m=em.find(Mobile.class, mid);		//need to mention type in 1st argument
		return m;
	}

	@Override
	public List<Mobile> getAllMobiles() 
	{
		TypedQuery<Mobile> query= em.createNamedQuery("Select_All",Mobile.class);
		return query.getResultList();
	}

	@Override
	public List<Mobile> fetchMobileInPriceRange(double min, double max) 
	{
		TypedQuery<Mobile> query=em.createNamedQuery("Select_Price_Range",Mobile.class);
		//String jpql="SELECT m FROM Mobile m WHERE m.price BETWEEN :min AND :max";
		query.setParameter("min", min);
		query.setParameter("max", max);
		return query.getResultList();
		
	}

}
