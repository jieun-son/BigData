package com.lect.ex06_car;

public class TestMain {
	public static void main(String[] args) {
		Car highCar = new HighGradeCar("���", "����Ÿ�̾�", 2500);
		Car lowCar  = new LowGradeCar("����", "�Ϲ�Ÿ�̾�", 1000);
		highCar.getSpec();
		lowCar.getSpec();
	}
}
