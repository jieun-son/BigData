package com.lect.ex05_override;
// �������̵�(�Լ� ������ : ��� �޴� Ŭ������ �ٽ� ������)
// �����ε� (�Լ� �ߺ����� : �Ű������� Ÿ���̳� ������ �޸� �Ͽ� ���� �̸��� �Լ� �ߺ��ؼ� ����)
public class ParentClass {
	public ParentClass() { // ������ �Լ��� �����ε�
		System.out.println("Parent �Ű����� ���� ������ �Լ�");
	}
	public ParentClass(int i) {
		System.out.println("Parent �Ű����� �ִ� ������ �Լ�");
	}
	public void method1() {
		System.out.println("Parent�� method1()");
	}
	public void method2() {
		System.out.println("Parent�� method2()");
	}
}