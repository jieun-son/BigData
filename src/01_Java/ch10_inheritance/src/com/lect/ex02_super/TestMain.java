package com.lect.ex02_super;
public class TestMain {
	public static void main(String[] args) {
		Child child = new Child(1,2);
		System.out.println("i°ª : "+child.getI());
		System.out.println("j°ª : "+child.getJ());
		child.setI(100);
		child.setJ(200);
		child.sum();
	}
}
