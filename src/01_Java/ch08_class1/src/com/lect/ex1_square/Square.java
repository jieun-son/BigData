// ��Ű����, Ŭ������, ������, �������Լ�, �޼ҵ�, setter&getter
// main() ; Square s = new Square()
//          Square s1 = new Square(10);
package com.lect.ex1_square;
public class Square {
	private int side;
	public Square() {//�������Լ� : return type�� ���� Ŭ������� ���� �Լ�
		System.out.println("�Ű����� ���� ������ �Լ� ȣ���");
	}
	public Square(int side) {// �Ű����� �ִ� ������ �Լ��� �뵵 : ������ �ʱ�ȭ
		this.side = side;
		System.out.println("�Ű����� �ִ� ������ �Լ� ȣ���. side �ʱ�ȭ�� ��");
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









