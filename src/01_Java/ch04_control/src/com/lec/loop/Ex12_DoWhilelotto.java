package com.lec.loop;
import java.util.Scanner;
// ��ǻ�Ͱ� �߻��� �ζǹ�ȣ(1~45) �Ѱ��� ���ߴ� ���α׷� 
public class Ex12_DoWhilelotto {
	public static void main(String[] args) {
//		0<=Math.random()    < 1
//		0<=Math.random()*45 < 45
//		(int)(Math.random()*45) ; 0~44������ ���� ����		
		int su, lotto;
		Scanner scanner = new Scanner(System.in);
		lotto = (int)(Math.random()*45) +1;
		do {
			System.out.print("1~45������ ���ڸ� ���� ������");
			su = scanner.nextInt();
			if(su==lotto) {
				break;
			}else if(su<lotto) {
				System.out.println("�Է��Ͻ� ������ ū ������");
			}else {
				System.out.println("�Է��Ͻ� ������ ���� ������");
			}
		}while(true);
		System.out.println("�������� �ζ� ��ȣ�� ���߼̽��ϴ�");
	}
}



