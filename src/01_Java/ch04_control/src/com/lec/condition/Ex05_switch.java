package com.lec.condition;
import java.util.Scanner;
// 사용자로부터 수를 입력받아 짝/홀수 여부를 출력
public class Ex05_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수는 ?");
		int su = scanner.nextInt();
		switch(su%2) {//정수, 문자(char), 문자열만 가능
			case 0: 
				System.out.println("짝수");
				break;
			default:
				System.out.println("홀수");
		}
//		if(su%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
	}
}
