package com.lec.ex;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dansu;
		do {
			System.out.print("���ϴ� �ܼ���(��, 2~9�ܸ� ����)?");
			dansu = sc.nextInt();
		}while(dansu<2 && dansu>9);
		gugudan(dansu);
		sc.close();
	}
	private static void gugudan(int su) {
		System.out.println("���ϴ� "+su+"�� �������Դϴ�");
		for(int i=1 ; i<10 ; i++) {
			System.out.printf("%d * %d = %d\n", su, i, su*i);
		}
	}
}
