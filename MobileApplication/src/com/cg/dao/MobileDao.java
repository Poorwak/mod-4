package com.cg.dao;

import java.util.List;

import com.cg.dto.Mobile;

public interface MobileDao 
{
	void addMobile(Mobile mobile);
	void updateMobile(Mobile mobile);
	void deleteMobile(Mobile mobile);
	Mobile findMobile(int mid);
	List<Mobile> getAllMobiles();
	List<Mobile> fetchMobileInPriceRange(double min,double max);
}
