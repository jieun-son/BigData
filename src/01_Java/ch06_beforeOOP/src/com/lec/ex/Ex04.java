package com.lec.ex;
// return값이 없는 메소드
public class Ex04 {
	public static void main(String[] args) {
		printLine('■');
		System.out.println("Hello, World!");
		printLine(); // 가는 라인 한 줄 출력하는 메소드
		System.out.println("Hello, Java!");
		printLine('■', 30);
	}
	public static void printLine(char ch, int cnt) {
		for(int i=0 ; i<cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	private static void printLine(char ch) { // 원하는 문자 라인 20개짜리 출력
		for(int i=0 ; i<20 ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	private static void printLine() { // 가는 라인 20개짜리 출력
		for(int i=0 ; i<20 ; i++) {
			System.out.print('-');
		}
		System.out.println();//개행 추가
	}
}
