package com.lect.ex06_wrapper;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String inputNo = sc.next();
		int no = Integer.parseInt(inputNo);
		System.out.println("입력하신 수 더하기 1은 "+(no+1));
	}
}
