package com.lect.ex01_string;

public class Ex04_Quiz_2002worldcup {
	public static void main(String[] args) {
		String str = "2002 WorldCup Korea";
		System.out.println("���� ���ڿ� :" + str);
		System.out.print("���ڿ� ������ :");
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
		System.out.print("\n¦�� ���ڿ� :");
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0)
				System.out.print(str.charAt(i));
			else
				System.out.print(" ");
		}
	}

}
