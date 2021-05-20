package com.lec.loop;
public class Ex05_continue {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
				continue; // 반복문 위인 for(증감->조건)부분으로 
			}
			System.out.println("i="+i);
		}
	}
}
