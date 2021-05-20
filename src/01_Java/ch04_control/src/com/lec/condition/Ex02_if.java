package com.lec.condition;
import java.util.Scanner;
public class Ex02_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 ->");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 ->");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.printf("첫번째 수가 %d만큼 더 큽니다.", num1-num2);
		}else if(num2 > num1) {
			System.out.printf("두번째 수가 %d만큼 더 큽니다.", num2-num1);
		} else {
			System.out.println("첫번재 수와 두번째 수는 같습니다");
		}
		sc.close();
	}
}
