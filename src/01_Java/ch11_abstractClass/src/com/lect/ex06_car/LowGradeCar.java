package com.lect.ex06_car;

public class LowGradeCar extends Car {
	private int tax = 50000; // 기본 세금
	public LowGradeCar(String color, String tire, int displacement) {
		super(color, tire, displacement);
	}
	@Override
	public void getSpec() {
		System.out.println("색  상 : "+getColor());
		System.out.println("타이어 : "+getTire());
		System.out.println("배기량 : "+getDisplacement());
		if(getDisplacement()>1000) {
			tax += (getDisplacement()-1000)*900;
		}
		System.out.println("세  금 : "+tax);
		System.out.println("**********************");
	}

}
