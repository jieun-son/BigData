package com.lect.ex02;
public class Cmodel implements IAcor {
	private String model = "C��";
	@Override
	public void dmbReceive() {
		System.out.println(model+"�� DMB �ۼ��� �Ұ����մϴ�");
	}
	@Override
	public void lte() {
		System.out.println(model+"�� LTE�� �Դϴ�.");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"�� TV ������ ��ž��Ǿ����ϴ�.");
	}
}