package com.lect.ex04_shape;

public class TestMain {
	public static void main(String[] args) {
		Shape[] shape = {new Circle(5),
						new Triangle(3, 4),
						new Rectangle(5, 7)
		};
		for(int i=0 ; i<shape.length ; i++) { // 예외발생(실행단계에서의 에러)
			shape[i].draw();
			System.out.println("넓이는 "+shape[i].computeArea());
		}
		for(Shape s : shape) {
			s.draw();
			System.out.println("넓이는 "+s.computeArea());
		}
	}
}






