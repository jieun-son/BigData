package com.lect.ex04_shape;

public class Triangle extends Shape{
	private int w; // 가로
	private int h; // 높이
	public Triangle(int w, int h) {
		this.w = w; this.h = h;
	}
	@Override
	public double computeArea() {
//		System.out.println("삼각형의 넓이는 " + (0.5*w*h));
		return 0.5*w*h;
	}
	@Override
	public void draw() {
		System.out.print("삼각형을 ");
		super.draw();
	}
}





