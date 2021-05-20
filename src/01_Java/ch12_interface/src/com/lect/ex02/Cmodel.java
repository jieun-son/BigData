package com.lect.ex02;
public class Cmodel implements IAcor {
	private String model = "C모델";
	@Override
	public void dmbReceive() {
		System.out.println(model+"은 DMB 송수신 불가능합니다");
	}
	@Override
	public void lte() {
		System.out.println(model+"은 LTE모델 입니다.");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"은 TV 리모콘 미탑재되었습니다.");
	}
}