package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContetext.xml");
		
		School lee = factory.getBean("mySchool",School.class);
		
		System.out.println(lee);
	}

}
