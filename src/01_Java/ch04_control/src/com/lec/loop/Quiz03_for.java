package com.lec.loop;

import java.util.Scanner;

public class Quiz03_for {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϴ� ������ ����?");
		int dansu = scanner.nextInt();
		for(int i=1 ; i<10 ; i++) {
			System.out.printf("%d * %d = %d\n", dansu, i, dansu*i);
		}
		scanner.close();
	}
}
