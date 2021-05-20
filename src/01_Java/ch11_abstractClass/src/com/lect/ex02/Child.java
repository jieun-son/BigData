package com.lect.ex02;
//Super method1(추상) method2(일반)
//Child method1(일반) method2(일반) method3(일반)
public class Child extends Super {
	@Override
	public void method1() {
		System.out.println("Child의 method1() - 추상메소드라 꼭 오버라이드!");
	}
	public void method3() {
		System.out.println("Child의 method3()");
	}
}
