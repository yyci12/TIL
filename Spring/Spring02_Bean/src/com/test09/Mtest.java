package com.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test09/applicationContext.xml");
		
		Tv tv = factory.getBean("samsung",SamsungTV.class);
		
		tv.volUp();
	}

}
