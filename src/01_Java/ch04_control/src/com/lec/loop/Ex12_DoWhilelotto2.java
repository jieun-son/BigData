package com.lec.loop;
import java.util.Scanner;
// ��ǻ�Ͱ� �߻��� �ζǹ�ȣ(1~45) �Ѱ��� ���ߴ� ���α׷� (������ �ٿ����� ����)
public class Ex12_DoWhilelotto2 {
	public static void main(String[] args) {
		int su, lotto;
		int min=1, max=45; // �ּҰ�, �ִ밪 ����
		Scanner scanner = new Scanner(System.in);
		lotto = (int)(Math.random()*45) +1;
		do {
			System.out.printf("%d~%d ������ ���ڸ� ���� ������", min, max);
			su = scanner.nextInt();
			if(su==lotto) {
				break;
			}else if(su<lotto) {
				min = su + 1;
			}else {
				max = su -1;
			}
		}while(true);
		System.out.println("�������� �ζ� ��ȣ�� ���߼̽��ϴ�");
	}
}



