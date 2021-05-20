package com.lec.ex;
import java.util.Scanner;
// 재귀호출
// n! = n * (n-1)! <n!=1일때>
// 3! = 3 * (3-1)!
// 2! = 2 * (2-1)!
// 1! = 1
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("몇 !을 계산할까요?");
		do {
			su = sc.nextInt();
			if(su>0) break;
			System.out.print("양수를 입력하셔야 !을 계산할 거예요");
		}while(true);
		long result = factorial(su);
		System.out.println(su+ "! = " +result);
	}
	//n! = n * (n-1)! <n!=1일때>
	private static long factorial(int su) {
		if(su<=1) {
			return 1;
		}else {
			return su*factorial(su-1);
		}
	}
//	private static long factorial(int su) {
//		long result = 1;
//		for (int i=su ; i>=1 ; i--) {
//			result *= i;
//		}
//		return result;
//	}
}







