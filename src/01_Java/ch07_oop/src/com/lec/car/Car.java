package com.lec.car;
// ������(private), �޼ҵ�(public), setter, getter
public class Car {
	private String color; // �Ӽ�, ������
	private int cc;
	private int speed;
	public void drive() { // �޼ҵ�
		speed = 60;
		System.out.println("�����Ѵ�. ���� �ӵ� " + speed);
	}
	public void park() {
		speed = 0;
		System.out.println("�����Ѵ�. ���� �ӵ� " + speed);
	}
	public void race() {
		speed = 120;
		System.out.println("���̽��Ѵ�. ���� �ӵ� " + speed);
	}
	// setter(color, cc, speed)
	public void setColor(String color) {
		this.color = color; // this '�� ��ü��'
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// getter (color, cc, speed)
	public String getColor() {
		return color;
	}
	public int getCc() {
		return cc;
	}
	public int getSpeed() {
		return speed;
	}
}














