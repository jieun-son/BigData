package com.lect.ex06_toy;
public class Mazinger implements IMoveArmLeg, IMissile{
	public Mazinger() {
		System.out.println("��¡�� �峭���Դϴ�");
		canMissile();
		canMoveArmLeg();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
	}
	@Override
	public void canMissile() {
		System.out.println("�̻����� �� �� �ֽ��ϴ�.");
	}
	@Override
	public void canMoveArmLeg() {
		System.out.println("�ȴٸ��� ������ �� �ֽ��ϴ�.");
	}
	@Override
	public String toString() {
		return "�̻����� ��� �ȴٸ��� �����̴� ��¡��";
	}
}





