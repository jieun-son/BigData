package com.lect.ex01_string;

public class Ex10_speedChk {
	public static void main(String[] args) {
		String str = "A";
		// 시작시간 측정
		long start = System.currentTimeMillis();
		// str 10만번 바꾸기
		for(int i=0 ; i<100000 ; i++) {
			str += "a"; // str = str + "a"; str = str.concat("a");
		}
		// 끝나는 시간 측정
		long end = System.currentTimeMillis();
		System.out.println("스트링 10만 변경 시간 : "+(end-start));
		StringBuffer strBuff = new StringBuffer("A");
		start = System.currentTimeMillis(); // 시작시점의 밀리세컨 측정
		for(int i=0 ; i<100000 ; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis(); // 끝나는 시점의 밀리세컨 측정
		System.out.println("스트링버퍼 10만 변경 시간 : "+ (end-start));
		StringBuilder strBuil = new StringBuilder("A");
		start = System.currentTimeMillis(); // 시작시점
		for(int i=0 ; i<100000 ; i++) {
			strBuil.append("a");
		}
		end = System.currentTimeMillis(); // 끝나는 시점
		System.out.println("스트링빌더 10만번 변경 시간 : "+ (end-start));
	}
}










