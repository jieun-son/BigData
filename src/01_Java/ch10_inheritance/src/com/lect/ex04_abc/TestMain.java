package com.lect.ex04_abc;
public class TestMain {
	public static void main(String[] args) {
		S[] sArr = {new A(), new B(), new C()};
		// A a = new A();
		S a = new A();
		//B b = new B();
		S b = new B();
		//C c = new C();
		S c = new C();
		S[] arr = {a, b, c};
		System.out.println(c.toString());
		System.out.println(c);
	}
}
