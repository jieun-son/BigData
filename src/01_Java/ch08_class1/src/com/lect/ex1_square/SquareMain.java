package com.lect.ex1_square;

public class SquareMain {
	public static void main(String[] args) {
		Square s1 = new Square();
		System.out.println("s1의 한변의 길이는 "+s1.getSide());
		Square s2 = new Square(10);
		System.out.println("s2의 한변의 길이는 "+s2.getSide());
		s1.setSide(5);
		s2.setSide(9);
		System.out.println("s1의 넓이는 "+s1.area());
		System.out.println("s2의 넓이는 "+s2.area());
	}
}
