package com.wzy.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 测试服务类
 * 
 */

@Service
public class TestService {

	@Cacheable(value={"memcached"},key="#id")
	public Object queryById(String id){
		System.out.println("set "+id+"=1...");
		return id;
	}
	
	@CachePut(value={"memcached"},key="#name")
	public Object queryByName(String name){
		System.out.println("set "+name+"=1...");
		return name;
	}
	
	@CacheEvict(value={"memcached"},key="#name")
	public Object deleteByName(String name){
		System.out.println("delete "+name+"...");
		return 1;
	}
	
	@CacheEvict(value={"memcached"},allEntries=true)
	public Object deleteAll(){
		System.out.println("delete all ...");
		return 1;
	}
}
