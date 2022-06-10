package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test01.Man;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Woman w = (Woman) factory.getBean("woman");
		com.test02.Man m = factory.getBean("man",com.test02.Man.class);		
		
		System.out.println("기상");
		w.classWork();
		System.out.println("------");
		System.out.println("기상2");
		m.classWork();
	}

}
