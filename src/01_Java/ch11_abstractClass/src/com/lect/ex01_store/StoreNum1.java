package com.lect.ex01_store;
// ��ġ�-4,500 �δ��-5,000 �����-6,000 ���뱹-���Ⱦ� �����-1,000��
public class StoreNum1 extends HeadQuarterStore {
	public StoreNum1(String name) {
		super(name);
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
}
