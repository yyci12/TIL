package com.test01;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBean mb = new MessageBeanKo();
		mb.sayHello(" hi spring");
		
		mb = new MessageBeanEn();
		mb.sayHello(" hi spring2");
	}

}
