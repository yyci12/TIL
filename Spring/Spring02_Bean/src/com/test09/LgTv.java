package com.test09;

public class LgTv implements Tv{
	public LgTv() {
		System.out.println("lgtv ��ü����");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Lgtv tv on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Lgtv tv off");
		
	}

	@Override
	public void volUp() {
		System.out.println("Lgtv tv volup");
		
	}

	@Override
	public void volDown() {
		System.out.println("Lgtv tv voldown");
		
	}

}
