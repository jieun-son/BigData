package com.lec.ex;
// ���׿�����       ���� ? ������ ���ϰ�� ���� ��/�� : ������ ������ ��� ���� ��/��
public class Ex05 {
	public static void main(String[] args) {
		int h=100;
//		String result;
//		if (h%2 == 0) {
//			result = "¦���Դϴ�";
//		}else {
//			result = "Ȧ���Դϴ�";
//		}
		String result = (h%2 == 0) ? "¦���Դϴ�":"Ȧ���Դϴ�";
		System.out.println("���׿��� ��� = "+result);
	}
}
