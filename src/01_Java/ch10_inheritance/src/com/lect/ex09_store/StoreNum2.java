package com.lect.ex09_store;
// ���а� 2ȣ�� : �δ��-5,000, �����-5,000, �����-����
public class StoreNum2 extends HeadQuarterStore{
	public StoreNum2(String name) {
		super(name);
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
	public void gongibab() {
		System.out.println("����� : ����");
	}
}
