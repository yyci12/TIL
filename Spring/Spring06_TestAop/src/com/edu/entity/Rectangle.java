package com.edu.entity;

public class Rectangle extends Shape {
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String title, int width, int height) {
		super(title, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void viewSize() {
		System.out.println(getTitle()+"�� ����" + (getWidth() * getHeight()));
	}

}
