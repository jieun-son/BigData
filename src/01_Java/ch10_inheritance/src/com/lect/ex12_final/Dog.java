package com.lect.ex12_final;

public final class Dog extends Animal {
	@Override
	public void running() {
		speed += 10;
		System.out.println("강아지가 꼬리를 흔들며 뛰어요. 현재속도 : " + speed);
	}
	public void method() {
		System.out.println("method");
	}
}
