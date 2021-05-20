package com.lect.ex3_accessTest;
public class AccessTest {
	private int privateMember; // ���� Ŭ���� ��������
	int defaultMember;         // ����Ʈ�������� : ���� ��Ű��������
	protected int protectedMember; // ������Ű���� ��ӹ��� Ŭ�������� ����
	public int publicMember;       // �ܺο��� �ƹ���

	private void privateMethod() {
		System.out.println("private �޼ҵ�");
	}
	void defaultMethod() {
		System.out.println("default �޼ҵ�");
	}
	protected void protectedMethod() {
		System.out.println("protected �޼ҵ�");
	}
	public void publicMethod() {
		System.out.println("public �޼ҵ�");
	}
}
