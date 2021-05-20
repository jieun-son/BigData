package com.lect.ex06_car;

public class TestMain {
	public static void main(String[] args) {
		Car highCar = new HighGradeCar("Áã»ö", "±¤ÆøÅ¸ÀÌ¾î", 2500);
		Car lowCar  = new LowGradeCar("»¡°­", "ÀÏ¹İÅ¸ÀÌ¾î", 1000);
		highCar.getSpec();
		lowCar.getSpec();
	}
}
