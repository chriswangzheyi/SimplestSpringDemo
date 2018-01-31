package com.wzy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzy.dao.User;

/*第1种方法：表单提交，以字段数组接收；*/

public class MethodOneController {
		
	 @RequestMapping(value = "/submitUserList_1", method ={RequestMethod.POST})
	    @ResponseBody
	    public String submitUserList_1(
	    		HttpServletResponse response,Integer[] id, String[] name, String[] pwd)
	                            throws Exception{

	        if(id == null || id.length <= 0){ return "No any ID.中文"; }
	        List<User> userList = new ArrayList<User>();
	        for (int i = 0; i < id.length; i++ ) {
	            User user = new User();
	            user.setId(id[i]);
	            user.setName(name[i]);
	            user.setPwd(pwd[i]);
	            userList.add(user);
	        }

	        for(int i = 0 ; i < userList.size() ; i++) {
	        	  System.out.println(userList.get(i));
	        	}
	        
	        
	        return null;
	    }

}
