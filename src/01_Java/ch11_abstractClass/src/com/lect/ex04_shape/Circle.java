package com.lect.ex04_shape;

public class Circle extends Shape {
	private int r;
	public Circle(int r) {
		this.r = r;
	}
	@Override
	public double computeArea() {
//		System.out.println("원의 넓이는 "+(3.14*r*r));
		return 3.14*r*r;
	}
	@Override
	public void draw() {
		System.out.print("원을 ");
		super.draw();
	}
}




