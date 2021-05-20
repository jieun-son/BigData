package com.lect.ex06_toy;
public class TestMain {
	public static void main(String[] args) {
		//Pooh pooh = new Pooh();
		//IMoveArmLeg pooh = new Pooh();
		IToy[] toy = {new Pooh(), new Mazinger(), new Airplane()};
		for(IToy t : toy) {
			// t객체의 클래스 이름
			System.out.println(t.getClass().getName());
			// t.toString() 자동 호출
			System.out.println(t);
		}
	}
}
