package com.lect.ex02;
//Super method1(추상) method2(일반)
//Child method1(일반) method2(일반) method3(일반)
public class TestMain {
	public static void main(String[] args) {
		//Super s = new Super(); 추상클래스는 객체 생성 불가 
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		Super c2 = new Child();
		c2.method1();
		c2.method2();
		((Child)c2).method3();
	}
}
