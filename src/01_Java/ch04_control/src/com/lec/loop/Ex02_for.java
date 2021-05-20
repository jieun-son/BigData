package com.lec.loop;
// 1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20=210
public class Ex02_for {
	public static void main(String[] args) {
		int tot = 0; // 1~20까지를 누적할 변수
		for(int i=1 ; i<=20 ; i++) {
			tot += i; //tot = tot +i;
			System.out.print(i);
			if(i!=20) {
				System.out.print("+");
			}//if
		}//for
		System.out.println("="+tot);
	}//main
}
