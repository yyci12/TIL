package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContetext.xml");
		
		TV tv = factory.getBean("lgTV",TV.class);
		
		tv.powerOn();
		tv.powerOff();
		
		tv = (TV)factory.getBean("ss");
		tv.powerOff();
		tv.powerOn();
	}

}
