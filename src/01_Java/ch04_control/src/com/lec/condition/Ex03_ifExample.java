package com.lec.condition;
import java.util.Scanner;
public class Ex03_ifExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� �� ");
		int su = scanner.nextInt();
		if(su>=0){
			System.out.printf("�Է��Ͻ� ���� ���밪 : %d\n",su);
		} else {
			System.out.printf("�Է��Ͻ� ���� ���밪 : %d\n", -su);
		}
		scanner.close();
	}
}
