package com.lect.ex02;
public class Bmodel implements IAcor {
	private String model = "B모델";
	@Override
	public void dmbReceive() {
		System.out.println(model+"은 DMB 송수신 가능합니다");
	}
	@Override
	public void lte() {
		System.out.println(model+"은 LTE모델 입니다.");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"은 TV 리모콘 탑재되었습니다.");
	}
}