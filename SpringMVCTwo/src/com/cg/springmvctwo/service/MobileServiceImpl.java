package com.cg.springmvctwo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvctwo.dao.IMobileDao;
import com.cg.springmvctwo.dto.Mobile;

@Service("mobileservice")
@Transactional

public class MobileServiceImpl implements IMobileService
{
	@Autowired
	IMobileDao mobiledao;
	@Override
	public List<Mobile> showAllMobile() 
	{
		return mobiledao.showAllMobile();
	}

	@Override
	public void deleteMobile(int mobId) 
	{
		mobiledao.deleteMobile(mobId);
		
	}

	@Override
	public void updateMobile(Mobile mob) 
	{
		// TODO Auto-generated method stub
		
	}

}
