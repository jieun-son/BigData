package com.lec.condition;

public class Ex01_if {
	public static void main(String[] args) {
		int seoulLunchPrice = 5000;
		if(seoulLunchPrice >= 7000){
			System.out.println("서울 점심값 비싸네요");
		} else if(seoulLunchPrice>=6000){
			System.out.println("뭐 괜찮은데 더 저렴했으면");
		} else {
			System.out.println("좋네");
		}
	}
}
