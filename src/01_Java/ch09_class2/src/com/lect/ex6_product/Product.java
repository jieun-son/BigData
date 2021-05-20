package com.lect.ex6_product;
public class Product {
	private int serialNo; // 객체 고유번호
	private String name;
	public static int count = 100;
	public Product(String name) {
		this.name = name;
		serialNo = ++count;
	}
	public void infoPrint() {
		System.out.printf("상품명 : %s, 시리얼넘버 : %d, 공유변수 count : %d\n",
				                 name, serialNo, count);
	}
}
