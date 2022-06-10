package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		person w = factory.getBean("woman",person.class);
		person m = factory.getBean("man",person.class);
		
		System.out.println("1-----");
		w.classwork();
		System.out.println("------");
		System.out.println("2-----");
		m.classwork();
	}

}
