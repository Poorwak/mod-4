package com.cg.mobapp.dao;

import java.util.List;

import com.cg.mobapp.dto.Mobile;

public interface IMobileDao 
{
	public void addMobileData(Mobile mob);
	public List<Mobile> showAllMobile();
}
