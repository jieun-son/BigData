package com.lect.ex1_tryCatch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j=1;
		do {
			try {
				System.out.print("ù��° ����? ");
				i = scanner.nextInt(); 
				break;
			}catch(InputMismatchException e) {
				System.out.println("ù��° ���� ���ڸ� �����ø� �ٽ� ����˴ϴ�");
				scanner.nextLine(); // ���۸� ����� ����
			}
		}while(true);
		System.out.print("�ι�° ����? ");
		try {
			j = scanner.nextInt();// ���ܰ� �߻��� ���� �ִ� �κ�
			System.out.println("i="+i+"\t j="+j);
			System.out.println("i * j = " + (i*j));
			System.out.println("i / j = " + (i/j));//���ܰ� �߻��� ���� �ִ� �κ�
		}catch (InputMismatchException e) {
			System.out.println("�ι�° ���ڸ� ���ڷ� �Է��Ͻø� 1�� �ʱ�ȭ�˴ϴ�.");
		}catch (ArithmeticException e) { // ���ܹ߻��� �����ؾ� �� �κ�
			System.out.println(e.getMessage()); // ���ܸ޼��� ���
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("i + j = " + (i+j));
		System.out.println("i - j = " + (i-j));
		System.out.println("DONE");
		scanner.close();
	}
}
