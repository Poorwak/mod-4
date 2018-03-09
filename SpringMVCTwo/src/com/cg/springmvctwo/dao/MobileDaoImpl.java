package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvctwo.dto.Mobile;

@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao
{
	@PersistenceContext
	EntityManager entitymanager;
	@Override
	public List<Mobile> showAllMobile() 
	{
		Query queryOne=entitymanager.createQuery("FROM Mobile");
		List<Mobile> allData=queryOne.getResultList();
		return allData;
	}

	@Override
	public void deleteMobile(int mobId) 
	{
		Query queryTwo=entitymanager.createQuery("DELETE FROM Mobile WHERE mobId=:id");
		queryTwo.setParameter("id", mobId);
		queryTwo.executeUpdate();
	}

	@Override
	public void updateMobile(Mobile mob) 
	{
		// TODO Auto-generated method stub
		
	}

}
