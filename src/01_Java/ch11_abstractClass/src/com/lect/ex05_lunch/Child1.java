package com.lect.ex05_lunch;

public class Child1 extends LunchMenu {
	public Child1(int rice, int bulgogi, int soup, 
			int banana, int milk, int almond) {
		super(rice, bulgogi, soup, banana, milk, almond);
		setTypeString("child1��");
	}
	@Override
	public int calculate() {//Child1�� ���̴� �������� �ٳ����� �Ƹ�带 �Խ��ϴ�
		return getRice()+getBulgogi()+getSoup()+getBanana()+getAlmond();
	}
}
