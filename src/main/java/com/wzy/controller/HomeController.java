package com.wzy.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home() {
		
		return "index";
		
	}
	
	
	
	@RequestMapping("/freemarker")
	 public String handleRequest(ModelMap model) throws Exception {  
	        //最简单的数据测试
	        model.addAttribute("name", "张三");
	        model.addAttribute("age", "18");
	        model.addAttribute("classzs", "五班");
			//list数据测试
			List list=new ArrayList<>();
			list.add(new Student("蛮王", "20", "三班"));
			list.add(new Student("寒冰", "18", "四班"));
			list.add(new Student("德玛", "25", "二班"));
			model.addAttribute("students",list);
	        return "first";  
	    }  
	
	
	@RequestMapping("/toJsp")
	public String toJsp(ModelMap model) throws Exception {  
		model.addAttribute("name", "张三");
		model.addAttribute("age", "18");
		model.addAttribute("classzs", "五班");
		return "hello";
	}  
	
	
	
	public class Student{
		private String name;//姓名
		private String age;//年龄
		private String classzs;//班级
		public String getName() {
			return name;
		}
		public String getAge() {
			return age;
		}
		public String getClasszs() {
			return classzs;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public void setClasszs(String classzs) {
			this.classzs = classzs;
		}
		public Student(String name, String age, String classzs) {
			super();
			this.name = name;
			this.age = age;
			this.classzs = classzs;
		}
	}
	

}
