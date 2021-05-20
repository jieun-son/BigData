package com.lec.ex;
// 형변환 = 묵시적인 형변환, 명시적인 형변환
public class VarEx06 {
	public static void main(String[] args) {
		int i1 = 10;
		double d1 = i1; // 묵시적인 형변환(작은 주머니 데이터를 큰 주머니에 할당)
		System.out.printf("i1=%d, d1=%.2f\n", i1, d1);
		d1 = 10.9;
		i1 = (int)d1; // 명시적인 형변환(큰주머니 데이터를 작은 주머니에 할당)
		System.out.printf("i1=%d, d1=%.2f\n", i1, d1);
	}
}
