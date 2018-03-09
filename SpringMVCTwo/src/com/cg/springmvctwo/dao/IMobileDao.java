package com.cg.springmvctwo.dao;

import java.util.List;

import com.cg.springmvctwo.dto.Mobile;

public interface IMobileDao 
{
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public void updateMobile(Mobile mob);
}
