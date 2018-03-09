package com.cg.mobapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mobapp.dto.Mobile;
import com.cg.mobapp.service.IMobileService;

@Controller
public class MobController
{
	@Autowired
	IMobileService mobileservice;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll()
	{
		return "home";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String addMobile(@ModelAttribute("my") Mobile mob, Map<String,Object> model)
	{
		List<String> categ=new ArrayList<>();
		categ.add("Sony");
		categ.add("Moto");
		categ.add("Samsung");
		model.put("categ",categ);		
		return "addMobile";
	}
	
	@RequestMapping(value="insertdata", method=RequestMethod.POST)
	public String insertMobile(@ModelAttribute("my") Mobile mob, Map<String,Object> model)
	{
		mobileservice.addMobileData(mob);
		return "success";
	}
	
	@RequestMapping(value="show", method=RequestMethod.GET)
	public ModelAndView showAllEmployee()
	{
		List<Mobile> myAllData =mobileservice.showAllMobile();
		return new ModelAndView("showall","temp",myAllData);		//(page is showall,modelName is temp,myAllData is the method)
	}
	

}
