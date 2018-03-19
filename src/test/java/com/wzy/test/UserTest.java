package com.wzy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wzy.dao.User;
import com.wzy.service.IUser;


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:springmvc-config.xml"}) //加载配置文件   
public class UserTest {
	
	@Autowired
	IUser IUser;

	@Test
	public void test(){
		User User = new User();
		User.setUsername("wzy");
		IUser.addUser(User.getUsername());
	}	
}
