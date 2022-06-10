package com.test01;

public class Man {
	public void classWork() {
		System.out.println("일어난다");
		
		try {
			System.out.println("씼는다.");
		} catch (Exception e) {
			System.out.println("hi");
		} finally {
			System.out.println("다시눕는다.");
		}
		
	}
}
