package com.wzy.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wzy.model.RegionModel;
import com.wzy.service.RegionService;

@Controller
public class HomeController {

	@Resource
	private RegionService RegionService;
	


	@RequestMapping(value="/")
	public String home() {
		

		RegionModel regionModel=RegionService.findById(1);
		System.out.println("regionModel="+regionModel);
		
		return "index";
		
	}
	
	
	@RequestMapping(value="/ReadRegion")
	public String readRegion() {
		
		
		return "index";
	}
	
}
