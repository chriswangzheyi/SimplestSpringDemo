package com.wzy.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	@NotBlank(message = "名字不能为空")
	private String name;
	
	@NotBlank(message = "性别不能为空")
	private String sex;
	
	@Min(18)
	private Integer age;
	
	
	private String comments;
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	//toString
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age
				+ ", comments=" + comments + "]";
	}
	
	
	
	
}
