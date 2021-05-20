// 패키지명, 클래스명, 데이터, 생성자함수, 메소드, setter&getter
// main() ; Square s = new Square()
//          Square s1 = new Square(10);
package com.lect.ex1_square;
public class Square {
	private int side;
	public Square() {//생성자함수 : return type이 없고 클래스명과 같은 함수
		System.out.println("매개변수 없는 생성자 함수 호출됨");
	}
	public Square(int side) {// 매개변수 있는 생성자 함수의 용도 : 데이터 초기화
		this.side = side;
		System.out.println("매개변수 있는 생성자 함수 호출됨. side 초기화도 함");
	}
	public int area() {
		return side * side;
	}
	public void setSide(int side) { // Square s = new Square(); s.setSide(10); s.getside()
		this.side = side;
	}
	public int getSide() {//s.getside()
		return side;
	}
}









