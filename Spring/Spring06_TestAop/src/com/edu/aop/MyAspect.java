package com.edu.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class MyAspect {

	public void before() {
		System.out.println("������ ���̸� ���Ѵ�.");
	}

	public void after() {
		System.out.println("������ ���̸� ����Ѵ�.");
	}
}
