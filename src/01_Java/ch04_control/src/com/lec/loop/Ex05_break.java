package com.lec.loop;
public class Ex05_break {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
				break; // �ݺ����� ��������
			}
			System.out.println("i="+i);
		}
	}
}
