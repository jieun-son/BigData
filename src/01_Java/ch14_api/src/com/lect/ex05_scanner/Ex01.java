package com.lect.ex05_scanner;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���? ");
		int age = scanner.nextInt(); // 
		System.out.println("�Է��Ͻ� ���̴� "+age);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scanner.next(); // ���ۿ� ó�� ������ \n�� �����ϰ� whiteSpace������ ������ ����
		System.out.println("�Է��Ͻ� �̸��� "+name);
		System.out.print("�ּҸ� �Է��ϼ���");
		scanner.nextLine(); // ���۸� ����� ����
		String address = scanner.nextLine(); // ���ۿ� \n�� ������ �ձ��� ���ϰ� ���ۿ� �����ִ� ������ ����
		System.out.println("�Է��Ͻ� �ּҴ� "+address);
	}
}
