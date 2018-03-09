package com.cg.mobapp.service;

import java.util.List;

import com.cg.mobapp.dto.Mobile;

public interface IMobileService 
{
	public void addMobileData(Mobile mob);
	public List<Mobile> showAllMobile();
}
