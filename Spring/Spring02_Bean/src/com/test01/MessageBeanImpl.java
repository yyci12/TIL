package com.test01;

public class MessageBeanImpl implements MessageBean {
	private String fruit;
	private int cost;
	@Override
	public void sayHello() {
		System.out.println("����: "+fruit +"\t ����: "+cost);
		
	}
	
	public MessageBeanImpl() {
		this.fruit = "banana";
		this.cost =5000;
	}
	
	public MessageBeanImpl(String fruit,int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}
	
}
