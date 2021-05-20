package com.lec.ex;
// 비트연산자 &(AND), |(OR), ^(XOR;서로다른값일때만 1)
public class Ex07 {
	public static void main(String[] args) {
		int n1 = 10;  //  0 ~ 0 1 0 1 0
		int n2 = 6;   //  0 ~ 0 0 1 1 0
		int result;   //  --------------
		result = n1 & n2;//0~ 0 0 0 1 0
		System.out.println("n1 & n2 = "+result);
		result = n1 | n2;//0~ 0 1 1 1 0
		System.out.printf("n1 | n2 = %x (%d)\n", result, result);
		result = n1 ^ n2;//0~ 0 1 1 0 0
		System.out.printf("n1 ^ n2 = %x (%d)\n", result, result);
	}
}






