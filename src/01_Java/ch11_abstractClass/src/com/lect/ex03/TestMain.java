package com.lect.ex03;
//Super : method1(�߻�), method2(�Ϲ�)
//Child : method1(�߻�), method2(�Ϲ�), method3(�Ϲ�)
//GradeChild : method1(�Ϲ�), method2(�Ϲ�), method3(�Ϲ�)
public class TestMain {
	public static void main(String[] args) {
		GrandChild g = new GrandChild();
		g.method1(); g.method2(); g.method3();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		Child c = new GrandChild();
		c.method1(); c.method2(); c.method3();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		Super s = new GrandChild();
		s.method1(); s.method2();
	}
}
