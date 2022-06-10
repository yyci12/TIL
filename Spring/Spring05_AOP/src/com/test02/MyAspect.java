package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
	Object target = null;
		
		System.out.println("기지개를 편다");
		
		try {
			target = invocation.proceed();
		} catch (Exception e) {
			System.out.println("쉬는 날이였다");
		} finally {
			System.out.println("다시 잔다.");
		}
		return target;
	}
}
