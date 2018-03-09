package com.cg.mobapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.mobapp.dto.Mobile;

@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao
{
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public void addMobileData(Mobile mob) 
	{
		entitymanager.persist(mob);
		entitymanager.flush();
		
	}

	@Override
	public List<Mobile> showAllMobile() 
	{
		Query queryOne=entitymanager.createQuery("FROM Mobile");
		List<Mobile> myList= queryOne.getResultList();
		return myList;
	}

}
