package com.lec.loop;
// 1~20������ 2�� 3�� ����� �ƴ� ���� ��
public class Homework01 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if((i%2!=0) && (i%3!=0)) {
				sum += i;
			}
		}
		System.out.println("1~20������ 2�� 3�� ����� �ƴ� ���� ���� "+sum);
	}
}