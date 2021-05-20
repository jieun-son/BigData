package com.lect.ex01;
public class TestMain {
	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		System.out.println(obj.CONSTANT_NUM);
		System.out.println(obj.CONSTANT_STRING);
		System.out.println(InterfaceClass.CONSTANT_NUM);
		System.out.println(InterfaceEx1.CONSTANT_NUM);
		System.out.println(InterfaceClass.CONSTANT_STRING);
		System.out.println(InterfaceEx2.CONSTANT_STRING);
		obj.method1();
		obj.method2();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		InterfaceEx1 obj1 = new InterfaceClass();
		obj1.method1();
		((InterfaceEx2)obj1).method2();
		InterfaceEx2 obj2 = new InterfaceClass();
		obj2.method2();
	}
}












