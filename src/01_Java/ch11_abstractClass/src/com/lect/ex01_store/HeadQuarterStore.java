package com.lect.ex01_store;
//��ġ�-����  �δ��-����  �����-���� ���뱹-����  �����-����
public abstract class HeadQuarterStore { // �߻�Ŭ����:�߻�޼ҵ尡 1���̻� ���� ��
	private String name;
	public HeadQuarterStore(String name) {
		this.name = name;
	}
	public abstract void kimchi(); // �߻�޼ҵ�(�޼ҵ� ���Ǹ� �ϰ� �����δ� ���� �޼ҵ�)
	public abstract void bude();
	public abstract void bibib();
	public abstract void sunde();
	public abstract void gongibab();
	public String getName() {
		return name;
	}
}
