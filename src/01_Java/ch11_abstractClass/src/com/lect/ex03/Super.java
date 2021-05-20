package com.lect.ex03;
// Super : method1(추상), method2(일반)
public abstract class Super {
	public Super() {} // 디폴트 생성자
	public abstract void method1(); // 추상메소드 ; 상속받는 클래스에서 반드시 오버라이드
	public void method2() { // 일반메소드
		System.out.println("Super의 method2()");
	}
	
}
