package com.lect.ex04_shape;

public class Rectangle extends Shape{
	private int w;
	private int h;
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	public double computeArea() {
//		System.out.println("�簢���� ���̴� "+w*h);
		return w*h;
	}
	@Override
	public void draw() {
		System.out.print("�簢���� ");
		super.draw();
	}
}
