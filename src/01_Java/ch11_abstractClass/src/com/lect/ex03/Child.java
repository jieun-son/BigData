package com.lect.ex03;
// Super : method1(추상), method2(일반)
// Child : method1(추상), method2(일반), method3(일반)
public abstract class Child extends Super{
	@Override
	public void method2() {
		System.out.println("Child의 method2()");
	}
	public void method3() {
		System.out.println("Child의 method3()");
	}
}
