package com.lect.ex5_momChild;
// Child first = new Child("ù°�ʸ���");
// first.takeMoney(1000);
// first.momPoush.money�� 2000
public class Child {
	private String name;
	static MomPouch momPouch = new MomPouch();
	public Child(String name) {
		this.name = name;
	}
	public void takeMoney(int money) {
		if(momPouch.money >= money) {
			// momPouch.money = momPouch.money - money;
			momPouch.money -= money;
			System.out.println(name+"�� "+money +
					"�� �������� �������� "+momPouch.money);
		}else {
			System.out.println(name+"�� ���� �� ����. �������� "+momPouch.money);
		}
	}
}










