package com.test03;

import org.springframework.stereotype.Component;

@Component("ss")
public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("Samsung tv power on");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsung tv power off");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung tv vol up");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung tv vol down");
	}
	 
}
