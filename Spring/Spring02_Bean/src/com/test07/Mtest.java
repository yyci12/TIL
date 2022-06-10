package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		
		Developer lee = factory.getBean("lee_2",Developer.class);
		Engineer yang = factory.getBean("yang_2",Engineer.class);
		System.out.println(lee);
		System.out.println(yang);
	}

}
