package com.lect.ex03;
// Super : method1(�߻�), method2(�Ϲ�)
// Child : method1(�߻�), method2(�Ϲ�), method3(�Ϲ�)
public abstract class Child extends Super{
	@Override
	public void method2() {
		System.out.println("Child�� method2()");
	}
	public void method3() {
		System.out.println("Child�� method3()");
	}
}
