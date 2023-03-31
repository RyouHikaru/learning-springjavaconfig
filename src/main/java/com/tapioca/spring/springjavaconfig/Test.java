package com.tapioca.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		DAO dao = context.getBean(DAO.class);
//		dao.create();
		
		Service service = context.getBean(Service.class);
		service.save();
		
		Service service2 = context.getBean(Service.class);
		service2.save();
		
		System.out.println("Service 1 hashcode: " + service.hashCode());
		System.out.println("Service 2 hashcode: " + service2.hashCode());
		
		context.close();
	}

}
