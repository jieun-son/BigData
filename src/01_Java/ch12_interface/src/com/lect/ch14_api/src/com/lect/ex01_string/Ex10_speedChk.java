package com.lect.ex01_string;

public class Ex10_speedChk {
	public static void main(String[] args) {
		String str = "A";
		// ���۽ð� ����
		long start = System.currentTimeMillis();
		// str 10���� �ٲٱ�
		for(int i=0 ; i<100000 ; i++) {
			str += "a"; // str = str + "a"; str = str.concat("a");
		}
		// ������ �ð� ����
		long end = System.currentTimeMillis();
		System.out.println("��Ʈ�� 10�� ���� �ð� : "+(end-start));
		StringBuffer strBuff = new StringBuffer("A");
		start = System.currentTimeMillis(); // ���۽����� �и����� ����
		for(int i=0 ; i<100000 ; i++) {
			strBuff.append("a");
		}
		end = System.currentTimeMillis(); // ������ ������ �и����� ����
		System.out.println("��Ʈ������ 10�� ���� �ð� : "+ (end-start));
		StringBuilder strBuil = new StringBuilder("A");
		start = System.currentTimeMillis(); // ���۽���
		for(int i=0 ; i<100000 ; i++) {
			strBuil.append("a");
		}
		end = System.currentTimeMillis(); // ������ ����
		System.out.println("��Ʈ������ 10���� ���� �ð� : "+ (end-start));
	}
}










