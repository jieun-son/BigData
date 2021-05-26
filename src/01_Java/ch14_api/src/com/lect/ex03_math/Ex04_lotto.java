package com.lect.ex03_math;
import java.util.Random;
// �迭�� lotto��ȣ 6�� �����ϱ�
public class Ex04_lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i=0 ; i<6 ; i++) {
			//lotto[i] = random.nextInt(45)+1;
			int temp = (int)(Math.random()*45)+1;
			boolean ok = true;
			for(int j=0; j<i ; j++) {
				if(temp==lotto[j]) { // �ߺ��� �� ���� ���
					i--;
					ok = false;
					break; // for - j �ݺ��� ��������
				}
			}// for �߻��� ������ ���� ���� �������� - �ߺ�Ȯ�ο�
			if(ok) {
				lotto[i] = temp;
			}
		}
		for(int l : lotto) {
			System.out.print(l + "\t");
		}
	}
}
