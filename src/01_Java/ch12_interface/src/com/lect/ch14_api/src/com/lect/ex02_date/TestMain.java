package com.lect.ex02_date;

public class TestMain {
	public static void main(String[] args) {
		Sawon s1 = new Sawon("a01","홍길동",Part.COMPUTER);
		Sawon s2 = new Sawon("b01","마길동",Part.ACCOUNTING);
		Sawon s3 = new Sawon("c01","신길동",Part.PLANNING, 2021,5,1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
