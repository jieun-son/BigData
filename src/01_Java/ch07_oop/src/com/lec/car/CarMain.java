package com.lec.car;

public class CarMain {
	public static void main(String[] args) {
		Car myPorsche = new Car();
		//myPorsche.color = "����";
		myPorsche.setColor("����");
		System.out.println(myPorsche.getColor());
		myPorsche.drive();
		myPorsche.park();
		myPorsche.race();
		Car yourPorsche = new Car();
		//yourPorsche.color = "gray";
		yourPorsche.setColor("gray");
		System.out.println("������������:"+myPorsche.getColor());
		System.out.println("������������:"+yourPorsche.getColor());
	}
}







