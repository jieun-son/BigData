package com.lect.ex07_super_dot;
// super. �θ�Ŭ������
public class ChildClass extends ParentClass {
	private String cStr = "�ڽ�Ŭ����";
	public ChildClass() {
		System.out.println("�ڽ� ������");
	}
	@Override
	public void getMamiName() {
		System.out.print("�̻� ���� �̻�");
		super.getMamiName();
	}
}
