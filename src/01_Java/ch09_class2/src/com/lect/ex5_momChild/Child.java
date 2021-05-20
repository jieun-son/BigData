package com.lect.ex5_momChild;
// Child first = new Child("첫째똘만이");
// first.takeMoney(1000);
// first.momPoush.money가 2000
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
			System.out.println(name+"가 "+money +
					"원 가져가서 엄마돈은 "+momPouch.money);
		}else {
			System.out.println(name+"은 돈을 못 받음. 엄마돈은 "+momPouch.money);
		}
	}
}










