package com.lect.ex05_lunch;

public class Child1 extends LunchMenu {
	public Child1(int rice, int bulgogi, int soup, 
			int banana, int milk, int almond) {
		super(rice, bulgogi, soup, banana, milk, almond);
		setTypeString("child1형");
	}
	@Override
	public int calculate() {//Child1형 아이는 간식으로 바나나와 아몬드를 먹습니다
		return getRice()+getBulgogi()+getSoup()+getBanana()+getAlmond();
	}
}
