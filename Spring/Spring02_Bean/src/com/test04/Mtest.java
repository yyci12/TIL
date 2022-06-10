package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
		//������ bean 2���� ������
		//��ü�� ����Ȱ� Ȯ��
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		Emp lee  = factory.getBean("lee",Emp.class);
		Emp hong = factory.getBean("hong",Emp.class);
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
