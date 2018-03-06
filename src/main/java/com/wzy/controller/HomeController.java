package com.wzy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wzy.model.User;

@Controller
public class HomeController {


	@RequestMapping(value="/")
	public String home() {
		
		return "index";
		
	}
	
	
	@RequestMapping(value="/submitByObject")
	public String submitByObject(@Validated User User,BindingResult bindingResult) {
		
		
		System.out.println(User.toString());
		
		if (bindingResult.hasErrors()) {
			List errerList = bindingResult.getAllErrors();
			
			for(int i = 0 ; i < errerList.size() ; i++) {
				  System.out.println("--------"+errerList.get(i));
			}
	    }
		
		
		return null;	
	}
}
