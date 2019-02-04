package com.vibha.spring.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service dao = ctx.getBean(Service.class);
		System.out.println(dao.hashCode());
		
		Service dao2 = ctx.getBean(Service.class);
		System.out.println(dao2.hashCode());
		dao.save();
		ctx.close();
		
	}

}
