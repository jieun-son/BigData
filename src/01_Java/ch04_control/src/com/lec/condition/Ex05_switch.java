package com.lec.condition;
import java.util.Scanner;
// ����ڷκ��� ���� �Է¹޾� ¦/Ȧ�� ���θ� ���
public class Ex05_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ?");
		int su = scanner.nextInt();
		switch(su%2) {//����, ����(char), ���ڿ��� ����
			case 0: 
				System.out.println("¦��");
				break;
			default:
				System.out.println("Ȧ��");
		}
//		if(su%2==0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
	}
}
