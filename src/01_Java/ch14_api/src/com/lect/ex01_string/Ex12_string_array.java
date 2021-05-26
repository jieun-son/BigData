package com.lect.ex01_string;
import java.util.StringTokenizer;
public class Ex12_string_array {
	public static void main(String[] args) {
		String str = "정해인 유준상 강동원 김윤석 하정우";
		StringTokenizer token = new StringTokenizer(str);
		String[] arr = new String[token.countTokens()];
		int idx = 0;
		while(token.hasMoreTokens()) {
			arr[idx++] = token.nextToken();
		}
		System.out.println("배열에 제대로 들어갔는지 확인");
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
