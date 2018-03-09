package com.cg.springmvctwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvctwo.dto.Mobile;
import com.cg.springmvctwo.service.IMobileService;

@Controller

public class MobileController 
{
	@Autowired
	IMobileService mobileservice;
	@RequestMapping(value="showall",method=RequestMethod.GET)
	public ModelAndView allMobileData()
	{
		List<Mobile> mList=mobileservice.showAllMobile();
		return new ModelAndView("mobileshow","temp",mList);
		
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String mobiledelete(@RequestParam("id") int mobid)
	{
		mobileservice.deleteMobile(mobid);
		return "redirect:/showall";
	}
}
