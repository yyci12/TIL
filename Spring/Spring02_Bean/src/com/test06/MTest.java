package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/beans.xml");
		Developer hong = factory.getBean("honggd",Developer.class);
		
		System.out.println(hong);
	}

}
