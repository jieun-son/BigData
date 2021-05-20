package com.lect.ex04_shape;

public class TestMain {
	public static void main(String[] args) {
		Shape[] shape = {new Circle(5),
						new Triangle(3, 4),
						new Rectangle(5, 7)
		};
		for(int i=0 ; i<shape.length ; i++) { // ���ܹ߻�(����ܰ迡���� ����)
			shape[i].draw();
			System.out.println("���̴� "+shape[i].computeArea());
		}
		for(Shape s : shape) {
			s.draw();
			System.out.println("���̴� "+s.computeArea());
		}
	}
}






