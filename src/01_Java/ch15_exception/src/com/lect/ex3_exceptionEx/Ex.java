package com.lect.ex3_exceptionEx;
public class Ex {
	public static void main(String[] args) {
		String strNo = "";
		int no = 0;
		try {
			no = Integer.parseInt(strNo.trim());
		}catch (NumberFormatException e) {
			System.out.println("�Է����� �ʴ� ���� 0���� �ʱ�ȭ");
		}
		System.out.println(no+1);
	}
}
