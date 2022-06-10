package com.edu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.entity.Shape;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape rect = factory.getBean("rect",Shape.class);
		Shape tri = factory.getBean("tri",Shape.class);
		
		rect.viewSize();
		System.out.println("------");
		tri.viewSize();
	}	

}
