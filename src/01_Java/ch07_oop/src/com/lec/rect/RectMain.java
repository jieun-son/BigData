package com.lec.rect;

public class RectMain {
	public static void main(String[] args) {
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		// ���� ���� ���� setting
		System.out.printf("r1�� ������ : %d %d\n", r1.getWidth(), r1.getHeight());
		System.out.printf("r2�� ������ : %d %d\n", r2.getWidth(), r2.getHeight());

		r1.setWidth(5); r1.setHeight(7);
		System.out.println("������");
		System.out.printf("r1�� ������ : %d %d\n", r1.getWidth(), r1.getHeight());
		System.out.printf("r2�� ������ : %d %d\n", r2.getWidth(), r2.getHeight());
		
		System.out.println(r1.area());
		System.out.println(r2.area());
	}
}
