package com.lec.ex;
import java.util.Scanner;
// ����, ö��, �浿, ����, ���� Ű �Է¹޾� ��� => ���� ū �л��̸��� Ű, ���� ���� �л��̸��� Ű
public class Ex05 {
	public static void main(String[] args) {
		String[] arrName = {"����","ö��","�浿","����","����"};
		int[] arrHeight = new int[arrName.length];
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		for(int idx=0 ; idx<arrHeight.length ; idx++) {
			System.out.print(arrName[idx]+"�� Ű��?");
			arrHeight[idx] = scanner.nextInt();
			total += arrHeight[idx];
		}
		System.out.printf("���Ű : %d\n", total/arrHeight.length);
		System.out.printf("���Ű : %f\n", total/(double)arrHeight.length);
		scanner.close();
		int maxIdx=0, maxHeight=0; // ������� ���ϱ� ���� ����
		int minIdx=0, minHeight=999; // �ִܽ��� ���ϱ� ���� ����
		for (int i=0 ; i<arrHeight.length ; i++) {
			if(arrHeight[i]>maxHeight) {
				maxHeight = arrHeight[i];
				maxIdx = i;
			}//if
			if(arrHeight[i]<minHeight) {
				minHeight = arrHeight[i];
				minIdx = i;
			}//if
		}//for
		System.out.printf("���� ���� �л��� : %s, Ű : %d\n", arrName[minIdx], minHeight);
		System.out.printf("���� ū �л��� : %s, Ű : %d\n", arrName[maxIdx], maxHeight);
	}
}






