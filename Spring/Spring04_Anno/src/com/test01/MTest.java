package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		MyNickName myNick = factory.getBean("myNickName",MyNickName.class);
		
		System.out.println(myNick);
	}

}
