package com.lect.ex06_car;
public abstract class Car {
	private String color; 
	private String tire;
	private int displacement;
	public Car(String color, String tire, int displacement) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
	}
	public abstract void getSpec(); // 추상메소드
	public String getColor() {
		return color;
	}
	public String getTire() {
		return tire;
	}
	public int getDisplacement() {
		return displacement;
	}
}
