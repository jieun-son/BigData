package com.lect.ex01_string;
public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		System.out.println(str1==str2? "str1�� str2�� ���� �ּ�":"str1�� str2�� �ٸ� �ּ�");
		System.out.println(str2==str3? "str2�� str3�� ���� �ּ�":"str2�� str3�� �ٸ� �ּ�");
		str1 = "java1";
		System.out.println(str1==str2? "str1�� str2�� ���� �ּ�":"str1�� str2�� �ٸ��ּ�");
		if(str2.equals(str3)) {
			System.out.println("���� ��Ʈ��");
		}
		System.out.println(str2.equals(str3)? "���� ��Ʈ��":"�ٸ� ��Ʈ��");
	}
}




