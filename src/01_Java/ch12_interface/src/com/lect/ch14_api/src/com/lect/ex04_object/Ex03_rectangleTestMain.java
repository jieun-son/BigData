package com.lect.ex04_object;
public class Ex03_rectangleTestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle r1 = new Rectangle(5, 3, "�Ķ�");
		r1.setWidth(10);
		Rectangle r2 = (Rectangle)r1.clone();
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		if(r1==r2) {
			System.out.println("���縦 �Ѱ� �ƴϰ� ���� �ּҸ� ����Ű�� ��");
		}else {
			System.out.println("�ٸ� �ּҸ� ����Ŵ");
		}
		if(r1.equals(r2)) {
			System.out.println("���� �簢��");
		}else {
			System.out.println("�ٸ� �簢��");
		}
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.getClass().getName());
	}
}















