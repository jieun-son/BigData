package com.lect.ex03;
//Child : method1(추상), method2(일반), method3(일반)
public class GrandChild extends Child{
	@Override
	public void method1() {
		System.out.println("GrandChild의 method1()");
	}
}