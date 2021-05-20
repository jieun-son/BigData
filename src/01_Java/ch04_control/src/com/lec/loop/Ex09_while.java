package com.lec.loop;
// 1~100까지 숫자 중 3의 배수들의 합을 출력
public class Ex09_while {
	public static void main(String[] args) {
		int tot = 0;
		int i = 0;
		while(++i<=100) {
			if(i%3!=0) {
				continue;
			}
			tot += i; // 3의 배수만 누적합
		}
	}
}
