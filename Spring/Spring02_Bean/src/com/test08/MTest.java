package com.test08;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new BeanFactory();
		
		Tv tv = (Tv)factory.getBean("samsung");
		
		tv.powerOff();
	}

}
