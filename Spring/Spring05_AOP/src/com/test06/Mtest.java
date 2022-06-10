package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=
				new ClassPathXmlApplicationContext("com/test06/applictionContext.xml");
		
		Person w = factory.getBean("woman",Person.class);
		Person m = factory.getBean("man",Person.class);
		
		System.out.println("1");
		w.classWork();
		System.out.println("-----");
		System.out.println("2");
		m.classWork();
	}

}
