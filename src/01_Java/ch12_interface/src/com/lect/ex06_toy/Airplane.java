package com.lect.ex06_toy;
public class Airplane implements IMissile, ILight{
	public Airplane() {
		System.out.println("����� �峭���Դϴ�.");
		canLight();
		canMissile();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}
	@Override
	public void canLight() {
		System.out.println("�Һ� �߻� �����մϴ�");
	}
	@Override
	public void canMissile() {
		System.out.println("�������� �� �� �ֽ��ϴ�.");
	}
	@Override
	public String toString() {
		return "�Һ��� �̻����� ������ �����";
	}
}
