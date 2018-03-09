package com.cg.springmvctwo.service;

import java.util.List;

import com.cg.springmvctwo.dto.Mobile;

public interface IMobileService 
{
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public void updateMobile(Mobile mob);
}
