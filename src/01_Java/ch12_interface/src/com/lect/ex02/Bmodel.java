package com.lect.ex02;
public class Bmodel implements IAcor {
	private String model = "B��";
	@Override
	public void dmbReceive() {
		System.out.println(model+"�� DMB �ۼ��� �����մϴ�");
	}
	@Override
	public void lte() {
		System.out.println(model+"�� LTE�� �Դϴ�.");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"�� TV ������ ž��Ǿ����ϴ�.");
	}
}