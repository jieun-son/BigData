package com.lect.ex02;
public class Amodel implements IAcor{
	private String model = "A모델";
	@Override
	public void dmbReceive() {
		System.out.println(model+"은 DMB 송수신 가능합니다.");
	}
	@Override
	public void lte() {
		System.out.println(model+"은 5G입니다");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"은 TV리모콘 탑재되었습니다.");
	}
}
