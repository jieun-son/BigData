package com.lect.ex06_toy;
public class TestMain {
	public static void main(String[] args) {
		//Pooh pooh = new Pooh();
		//IMoveArmLeg pooh = new Pooh();
		IToy[] toy = {new Pooh(), new Mazinger(), new Airplane()};
		for(IToy t : toy) {
			// t��ü�� Ŭ���� �̸�
			System.out.println(t.getClass().getName());
			// t.toString() �ڵ� ȣ��
			System.out.println(t);
		}
	}
}
