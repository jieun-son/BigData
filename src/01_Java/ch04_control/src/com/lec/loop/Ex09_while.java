package com.lec.loop;
// 1~100���� ���� �� 3�� ������� ���� ���
public class Ex09_while {
	public static void main(String[] args) {
		int tot = 0;
		int i = 0;
		while(++i<=100) {
			if(i%3!=0) {
				continue;
			}
			tot += i; // 3�� ����� ������
		}
	}
}
