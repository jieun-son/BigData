package com.lect.ex02;
public class Amodel implements IAcor{
	private String model = "A��";
	@Override
	public void dmbReceive() {
		System.out.println(model+"�� DMB �ۼ��� �����մϴ�.");
	}
	@Override
	public void lte() {
		System.out.println(model+"�� 5G�Դϴ�");
	}
	@Override
	public void tvremotecontrol() {
		System.out.println(model+"�� TV������ ž��Ǿ����ϴ�.");
	}
}
