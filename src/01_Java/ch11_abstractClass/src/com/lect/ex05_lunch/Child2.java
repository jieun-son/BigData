package com.lect.ex05_lunch;

public class Child2 extends LunchMenu{
	public Child2(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		super(rice, bulgogi, soup, banana, milk, almond);
		setTypeString("child2Çü");
	}
	@Override
	public int calculate() {
		return getRice()+getBulgogi()+getSoup()+getMilk();
	}
}
