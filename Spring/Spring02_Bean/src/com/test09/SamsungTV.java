package com.test09;

public class SamsungTV implements Tv {
	
	public SamsungTV() {
		System.out.println("?Ｚtv ??ü????");
	}
	@Override
	public void powerOn() {
		System.out.println("samsung tv on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv off");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv volup");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv voldown");
	}

}
