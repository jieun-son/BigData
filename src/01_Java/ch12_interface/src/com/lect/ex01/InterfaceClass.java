package com.lect.ex01;
// InterfaceEx1 : CONSTANT_NUM, method1()
// InterfaceEx2 : CONSTANT_STRING, method2()
public class InterfaceClass implements InterfaceEx1, InterfaceEx2{
	@Override
	public void method1() {
		System.out.println("1. ���� ������ implements�� Ŭ�������� �մϴ�");
	}
	@Override
	public String method2() {
		System.out.println("2. ���� ������ implements�� Ŭ�������� �մϴ�");
		return null;
	}
}