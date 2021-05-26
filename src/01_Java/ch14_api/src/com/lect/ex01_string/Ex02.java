package com.lect.ex01_string;
public class Ex02 {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "    ja va  ";
		System.out.println("1."+str1.concat(str2));//abcXabcABCXabc
		System.out.println("2."+str1.substring(3));//3��°���� ������ Xabc
		System.out.println("3."+str1.substring(3,6));//3��°���� 6��°�ձ��ڱ��� Xab
		System.out.println("4."+str1.length()); // ���ڿ����� 7
		System.out.println("5."+str1.toUpperCase()); // �빮�ڷ� ABCXABC
		System.out.println("6."+str1.toLowerCase()); // �ҹ��ڷ� abcxabc
		System.out.println("7."+str1.charAt(3)); // 3��° index�� ���� X
		System.out.println("8."+str1.indexOf("b")); //1 "b"�� ó�� ������ index
		System.out.println("9."+str1.indexOf("ȫ�浿")); // ���� ��Ʈ���� ��� -1
		System.out.println("10."+str1.indexOf("b", 3));//3��° index���� ó�������� "b"�� index
		str1 = "abcXabc"; str2="ABCXabc";
		System.out.println("11."+str1.lastIndexOf("b"));// ���������� "b" index => 5
		System.out.println("12."+str1.equals(str2)); // false||true
		System.out.println("13."+str1.equalsIgnoreCase(str2)); //��ҹ��� �������� �ʰ� ��
		System.out.println("14."+str3.trim()); // �¿� space ���� ja va
		System.out.println("15."+str1.replace('a', '��'));//a�� �ڷ� ����
		System.out.println("16."+str1.replace("abc", "�ٲ�")); // abc�� �ٲ�� ����
		System.out.println("17."+str1.replaceAll("abc", "�ٲ�"));
		System.out.println("���� str1="+str1);
	}
}





