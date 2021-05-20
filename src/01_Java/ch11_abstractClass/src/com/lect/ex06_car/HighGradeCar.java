package com.lect.ex06_car;

public class HighGradeCar extends Car {
	private int tax = 150000; // �⺻ ����
	public HighGradeCar(String color, String tire, int displacement) {
		super(color, tire, displacement);
	}
	@Override
	public void getSpec() {
		System.out.println("��  �� : "+getColor());
		System.out.println("Ÿ�̾� : "+getTire());
		System.out.println("��ⷮ : "+getDisplacement());
		if(getDisplacement()>1600) {
			tax += (getDisplacement()-1600)*1000;
		}
		System.out.println("��  �� : "+tax);
		System.out.println("**********************");
	}

}
