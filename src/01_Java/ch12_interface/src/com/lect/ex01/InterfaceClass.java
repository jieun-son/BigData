package com.lect.ex01;
// InterfaceEx1 : CONSTANT_NUM, method1()
// InterfaceEx2 : CONSTANT_STRING, method2()
public class InterfaceClass implements InterfaceEx1, InterfaceEx2{
	@Override
	public void method1() {
		System.out.println("1. 실제 구현은 implements한 클래스에서 합니다");
	}
	@Override
	public String method2() {
		System.out.println("2. 실제 구현은 implements한 클래스에서 합니다");
		return null;
	}
}