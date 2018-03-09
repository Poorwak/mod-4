package com.cg.service;

import java.util.List;

import com.cg.dao.MobileDao;
import com.cg.dao.MobileDaoImpl;
import com.cg.dto.Mobile;

public class MobileServiceImpl implements MobileService
{
	MobileDao mDao= new MobileDaoImpl();
	
	@Override
	public void addMobile(Mobile mobile) 
	{
		mDao.addMobile(mobile);
		
	}

	@Override
	public void updateMobile(Mobile mobile) 
	{
		mDao.updateMobile(mobile);
		
	}

	@Override
	public void deleteMobile(Mobile mobile) 
	{
		mDao.deleteMobile(mobile);
		
	}

	@Override
	public Mobile findMobile(int mid) 
	{
		
		return mDao.findMobile(mid);
	}

	@Override
	public List<Mobile> getAllMobiles() 
	{
		
		return mDao.getAllMobiles();
	}

	@Override
	public List<Mobile> fetchMobileInPriceRange(double min, double max)
	{
		
		return mDao.fetchMobileInPriceRange(min, max);
	}

}
