package com.lec.quiz;
// ������������ ����, ��� ���
public class Quiz5 {
	public static void main(String[] args) {
		int kor=99, eng=99, mat=100;
		int sum = kor + eng + mat;
		double avg = sum/3.;
		System.out.printf("���� = %d, ����=%d, ����=%d\n",kor, eng, mat);
		System.out.printf("���� = %d\n", sum);
		System.out.printf("���� = %.2f\n", avg);
	}
}
