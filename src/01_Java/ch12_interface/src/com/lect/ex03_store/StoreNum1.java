package com.lect.ex03_store;
// ��ġ�-4,500 �δ��-5,000 �����-6,000 ���뱹-���Ⱦ� �����-1,000��
public class StoreNum1 implements HeadQuarterStore {
	private String name;
	public StoreNum1(String name) {
		this.name = name;
	}
	@Override
	public void kimchi() {
		System.out.println("��ġ� : 4,500��");
	}
	@Override
	public void bude() {
		System.out.println("�δ�� : 5,000��");
	}
	@Override
	public void bibib() {
		System.out.println("����� : 6,000��");
	}
	@Override
	public void sunde() {
		System.out.println("���뱹 �� �Ⱦ�");
	}
	@Override
	public void gongibab() {
		System.out.println("����� : 1000��");
	}
	@Override
	public String getName() {
		return name;
	}
}
