package com.lect.ex01_string;

public class Ex09_stringbuilder {
	public static void main(String[] args) {
		String st = "abc";
		StringBuilder str = new StringBuilder("abc");
		System.out.println("str�� �ؽ��ڵ� : "+str.hashCode());
		System.out.println("1."+str);
		str.append("def"); // abcdef
		System.out.println("2."+str);
		str.insert(3, "AAA"); // 3��° index�� AAA�� �߰� abcAAAdef
		System.out.println("3."+str);
		str.delete(3, 6); // 3��°���� 6��° �ձ����� ���ڿ� ���� abcdef
		System.out.println("4."+str);		
		System.out.println("str�� �ؽ��ڵ� : "+str.hashCode()); // ���ڿ��� ���ص� ��ü �������� �ʰ�
		int builderSize = str.capacity();
		System.out.println("str�� ����ũ�� : "+builderSize);
		str.append("12345678901234567890");
		System.out.println("5."+str);
		System.out.println("str�� ����ũ�� : "+str.capacity());
		System.out.println("str�� �ؽ��ڵ� : "+str.hashCode());
	}
}
