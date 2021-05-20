package com.lec.ex;
// 증감연산자 : ++ --
public class Ex02 {
	public static void main(String[] args) {
		int numFirst = 10;
		int n = ++numFirst; // numFirst 값을 하나 증가
		System.out.printf("n=%d, numFirst=%d\n", n, numFirst); 
		n = --numFirst; // numFirst 값을 하나 감소
		System.out.printf("n=%d, numFirst=%d\n", n, numFirst);
	}
}
