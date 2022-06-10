package com.test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * *(..))")
	public void myClass() {
	}
	
	@Before("myClass()")
	public void before() {
		System.out.println("before()");
	}
	
	@After("myClass()")
	public void after() {
		System.out.println("after()");
	}
}
