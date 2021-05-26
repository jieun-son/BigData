package com.lect.ex01_string;

import java.util.StringTokenizer;

public class Ex11_tokenizing {
	public static void main(String[] args) {
		String str = "정해인 유준상 강동원 김윤석 하정우";
		String str1 = "2021/05/24";
		StringTokenizer token1 = new StringTokenizer(str); // str을 space구분자로 분할
		StringTokenizer token2 = new StringTokenizer(str1,"/"); // str1을 /구분자로 분할
		System.out.println("token1의 갯수 : "+token1.countTokens());
		System.out.println("toekn2의 갯수 : "+token2.countTokens());
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
