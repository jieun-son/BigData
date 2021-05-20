package com.lec.ex;
//함수의 오버로딩 : sum(10), sum(10,100)
public class Arithmetic {
	public int sum(int from, int to) {
		int result = 0;//누적해서 return 할 변수
		for(int i=from ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
	int sum(int to) {
		int result = 0;
		for(int i=1 ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
	public String evenOdd(int value) {
		return value%2==0 ? "짝수" : "홀수";
	}
	public int abs(int value) {
		int result = value>=0 ? value : -value;
		return result;
	}
}








