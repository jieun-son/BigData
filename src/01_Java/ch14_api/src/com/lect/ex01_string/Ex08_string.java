package com.lect.ex01_string;
public class Ex08_string {
	public static void main(String[] args) {
		String str = "Hello~";
		String str1 = "Hello~";
		System.out.println("str�� �ؽ��ڵ� : "+str.hashCode());
		System.out.println("str1�� �ؽ��ڵ� : "+str1.hashCode());
		System.out.println(str==str1 ? "str�� str1�� ���� �ּ�":"str�� str1�� �ٸ� �ּ�");
		str = "hello"; // str�� ������ ����Ǹ� �ٽ� String ��ü ����
		System.out.println("str�� �ؽ��ڵ� : "+str.hashCode());
		System.out.println("str1�� �ؽ��ڵ� : "+str1.hashCode());
		System.out.println(str==str1? "str�� str1�� ���� �ּ�":"str�� str1�� �ٸ� �ּ�");
	}
}
