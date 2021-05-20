package com.lect.ex05_override;

public class TestMain {
	public static void main(String[] args) {
		ParentClass pObj1 = new ParentClass();
		ParentClass pObj2 = new ParentClass(1);
		pObj1.method1();
		pObj2.method2();
		System.out.println("~~~~~~~~~~~~~");
		ChildClass cObj1 = new ChildClass();
		cObj1.method1();
		cObj1.method2();
		cObj1.method3();
		System.out.println("~~~~~~~~~~~~~~");
		ParentClass cObj2 = new ChildClass(1);
		cObj2.method1();
		cObj2.method2();
		// cObj2.method3(); 타입때문에 불가
		((ChildClass)cObj2).method3(); // 명시적인 형변환
	}
}













