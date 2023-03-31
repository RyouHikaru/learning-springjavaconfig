package com.tapioca.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Service {

	@Autowired
	private DAO dao;
	
	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");
	}
	
	public void save() { 
		dao.create();
	}
}
