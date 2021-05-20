package com.lec.loop;
// 1~10 ´©Àû°ö
public class Quiz01_for {
	public static void main(String[] args) {
		int tot = 1;
		for(int su=1 ; su<11 ; su++) {
			tot *= su; //tot = tot * su;
		}
		System.out.println("1~10±îÁö ´©Àû°öÀº "+tot);
	}
}
