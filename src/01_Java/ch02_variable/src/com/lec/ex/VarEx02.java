package com.lec.ex;

public class VarEx02 {
	public static void main(String[] args) {
		int i = 10 ; // 4byte짜리 i주머니에 10을 넣는다.
		byte j = 20; // 1byte짜리 j주머니에 20을 할당한다.
		double d = 1; // 8byte짜리 실수 d주머니에 0.1을 할당한다.
		char c = 'C'; // 2byte짜리 문자 c주머니에 '씨'를 할당
		boolean ok = true;
		long l = 2200000000L;
		System.out.println("i\t j\t d"); //\t탭  println 개행포함
		System.out.println(i+"\t"+j+"\t"+d);
		System.out.print("변수 c의 값과 코드\n");  // print는 개행 미포함
		System.out.printf("c=%c, c의 코드값=%d\n", c, (int)c);
		System.out.printf("ok=%b\n", ok);
		System.out.printf("l=%d\n", l);
		System.out.printf("d=%5.2f",d);
		// %d(정수) %f(실수) %b(불린) %x(16진수) %c(문자) %s(문자열)
	}
}
