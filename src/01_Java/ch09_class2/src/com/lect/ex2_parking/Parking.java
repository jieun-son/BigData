package com.lect.ex2_parking;
import constant.Price;
public class Parking {
	private String no;
	private int inTime;
	private int outTime;
//	private final int HOURLYRATE = 2000; // ���ܺ���(���)
	public Parking() {}
	public Parking(String no, int inTime) {
		this.no = no; this.inTime = inTime;
		System.out.println(no+"�� �������");
		System.out.println("�����ð� : "+inTime+"��");
		System.out.println("***********************");
	}
	
	public void out(int outTime) {
		this.outTime = outTime;
		int fee = (outTime-inTime) * Price.HOURLYRATE;
		System.out.println(no+"�� �ȳ��� ������");
		System.out.println("�����ð� : "+ inTime +"��");
		System.out.println("�����ð� : "+ outTime +"��");
		System.out.println("������� : "+fee+"��");
		System.out.println("***********************");
	}
}
