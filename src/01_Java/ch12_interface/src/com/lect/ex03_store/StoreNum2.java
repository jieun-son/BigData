package com.lect.ex03_store;
// ���а� 2ȣ�� : ��ġ�-5,000 �δ��-5,000 �����-5,000 ���뱹-5,000  �����-����
public class StoreNum2 implements HeadQuarterStore{
	private String name;
	public StoreNum2(String name) {
		this.name = name;
	}
	@Override
	public void kimchi() {
		System.out.println("��ġ� : 5,000��");
	}
	@Override
	public void bude() {
		System.out.println("�δ�� : 5,000��");
	}
	@Override
	public void bibib() {
		System.out.println("����� : 5,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 : ����");
	}
	@Override
	public void gongibab() {
		System.out.println("����� : ����");
	}
	@Override
	public String getName() {
		return name;
	}
}





