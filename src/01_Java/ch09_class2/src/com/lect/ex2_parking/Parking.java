package com.lect.ex2_parking;
import constant.Price;
public class Parking {
	private String no;
	private int inTime;
	private int outTime;
//	private final int HOURLYRATE = 2000; // 종단변수(상수)
	public Parking() {}
	public Parking(String no, int inTime) {
		this.no = no; this.inTime = inTime;
		System.out.println(no+"님 어서오세요");
		System.out.println("입차시간 : "+inTime+"시");
		System.out.println("***********************");
	}
	
	public void out(int outTime) {
		this.outTime = outTime;
		int fee = (outTime-inTime) * Price.HOURLYRATE;
		System.out.println(no+"님 안녕히 가세요");
		System.out.println("입차시간 : "+ inTime +"시");
		System.out.println("출차시간 : "+ outTime +"시");
		System.out.println("주차요금 : "+fee+"원");
		System.out.println("***********************");
	}
}
