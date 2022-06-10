package com.test03;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("lg tv power on");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("lg tv power off");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("lg tv vol up");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("lg tv vol down");
	}
	 
}
