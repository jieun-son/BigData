package com.lect.ex02_super;
// main�Լ����� Child child = new Child(1,2);
public class Child extends SuperIJ{
	private int total;
	public Child() {
		System.out.println("�Ű����� ���� Child ������ �Լ�");
	}
	public Child(int i, int j) {
		setI(i); // this.i = i;
		setJ(j); // this.j = j;
		System.out.println("�Ű����� �ִ� Child ������ �Լ�");
	}
	public void sum() {
		total = getI() + getJ(); //total = i+j;
		System.out.println("�� ��ü�� total���� "+total);
	}
}