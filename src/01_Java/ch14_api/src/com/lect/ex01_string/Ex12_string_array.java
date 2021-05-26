package com.lect.ex01_string;
import java.util.StringTokenizer;
public class Ex12_string_array {
	public static void main(String[] args) {
		String str = "������ ���ػ� ������ ������ ������";
		StringTokenizer token = new StringTokenizer(str);
		String[] arr = new String[token.countTokens()];
		int idx = 0;
		while(token.hasMoreTokens()) {
			arr[idx++] = token.nextToken();
		}
		System.out.println("�迭�� ����� ������ Ȯ��");
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
