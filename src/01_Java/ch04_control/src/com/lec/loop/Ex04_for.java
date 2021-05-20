package com.lec.loop;
/* 15~50까지 한줄에 5개 숫자씩 출력하세요
 * 15 16 17 18 19
 * 20 21 22 23 24
 */
public class Ex04_for {
	public static void main(String[] args) {
		for(int i=15 ; i<=50 ; i++) {
			System.out.print(i+" ");
			if(i%5 == 4) {
				System.out.println();
			}//if
		}//for
	}
}
