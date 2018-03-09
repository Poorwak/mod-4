package com.cg.mobapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.mobapp.dao.IMobileDao;
import com.cg.mobapp.dto.Mobile;

@Service("mobileservice")
@Transactional
public class MobileServiceImpl implements IMobileService
{
	@Autowired
	IMobileDao mobiledao;
	
	@Override
	public void addMobileData(Mobile mob) 
	{
		mobiledao.addMobileData(mob);
		
	}

	@Override
	public List<Mobile> showAllMobile()
	{
		
		return mobiledao.showAllMobile();
	}

}
