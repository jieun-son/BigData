package com.lect.ex02;
//Super method1(�߻�) method2(�Ϲ�)
//Child method1(�Ϲ�) method2(�Ϲ�) method3(�Ϲ�)
public class Child extends Super {
	@Override
	public void method1() {
		System.out.println("Child�� method1() - �߻�޼ҵ�� �� �������̵�!");
	}
	public void method3() {
		System.out.println("Child�� method3()");
	}
}
