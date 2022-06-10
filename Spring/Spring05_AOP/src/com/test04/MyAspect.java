package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("1�ܰ�");
	}
	
	@After("execution(public * *(..))")
	public void after(JoinPoint join) {
		System.out.println("2�ܰ�");
	}
	
	@AfterReturning(pointcut = "execution(public * *(..))",returning = "returnV")
	public void returning(JoinPoint join, Object returnV) {
		System.out.println(returnV+"study");
	}
	
	@AfterThrowing("execution(public * com.test04.*.*(..))")
	public void throwing(JoinPoint join) {
		System.out.println("error");
	}
	
}
