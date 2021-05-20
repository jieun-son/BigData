package com.lect.ex03;
//Super : method1(추상), method2(일반)
//Child : method1(추상), method2(일반), method3(일반)
//GradeChild : method1(일반), method2(일반), method3(일반)
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
