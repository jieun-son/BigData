package com.lect.ex01_string;

public class Ex04_Quiz_2002worldcup {
	public static void main(String[] args) {
		String str = "2002 WorldCup Korea";
		System.out.println("정상 문자열 :" + str);
		System.out.print("문자열 뒤집기 :");
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
		System.out.print("\n짝수 문자열 :");
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0)
				System.out.print(str.charAt(i));
			else
				System.out.print(" ");
		}
	}

}
