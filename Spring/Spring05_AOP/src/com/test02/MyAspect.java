package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
	Object target = null;
		
		System.out.println("�������� ���");
		
		try {
			target = invocation.proceed();
		} catch (Exception e) {
			System.out.println("���� ���̿���");
		} finally {
			System.out.println("�ٽ� �ܴ�.");
		}
		return target;
	}
}
