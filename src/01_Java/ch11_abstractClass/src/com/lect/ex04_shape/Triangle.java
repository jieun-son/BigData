package com.lect.ex04_shape;

public class Triangle extends Shape{
	private int w; // ����
	private int h; // ����
	public Triangle(int w, int h) {
		this.w = w; this.h = h;
	}
	@Override
	public double computeArea() {
//		System.out.println("�ﰢ���� ���̴� " + (0.5*w*h));
		return 0.5*w*h;
	}
	@Override
	public void draw() {
		System.out.print("�ﰢ���� ");
		super.draw();
	}
}





