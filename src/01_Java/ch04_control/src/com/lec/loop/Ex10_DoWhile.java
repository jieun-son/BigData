package com.lec.loop;
import java.util.Scanner;
// ����ڷκ��� ¦���� �Է¹޾� ����Ͻÿ�.
public class Ex10_DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		do {
			System.out.print("�ݵ�� ¦���� �Է��ϼ��� :");
			num = scanner.nextInt();
		}while(num%2 != 0);
		System.out.println("�Է��Ͻ� ¦���� "+num);
		scanner.close();
	}
}
