package com.lect.ex1_list;

import java.util.ArrayList;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "str0"; array[1] = "str1" ; array[2] = "str2";
		for(int i=0 ; i<array.length ; i++) {
			System.out.printf("array[%d] = %s\t", i, array[i]);
		}
		for(String arr : array) {
			System.out.print(arr + "\t");
		}
		System.out.println("\n - - - - - ArrayList - - - - - ");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0"); // 0�� �ε���
		arrayList.add("str1"); // 1�� �ε��� -> 2�� �ε�����
		arrayList.add("str2"); // 2�� �ε��� -> 3�� �ε�����
		arrayList.add(1, "11111"); // 1�� �ε���
		arrayList.set(1, "str1"); // 1�� �ε����� ���� ����
		for(String arr : arrayList) {
			System.out.print(arr + "\t");
		}
		System.out.println("\n - remove�� �Ŀ� - ");
		arrayList.remove(1); // 1��° �ε����� ������ ����. 2->1, 3->2
		arrayList.remove(arrayList.size()-1); // �Ǹ����� �ε��� ������ ����
		for(int i=0 ; i<arrayList.size() ; i++) {
			System.out.printf("%d��° �ε��� ���� : %s\t", i, arrayList.get(i));
		}
		System.out.println();//����
		System.out.println(arrayList);
		arrayList.clear(); // arrayList�� ��� ������ ����
		if(arrayList.size()==0) {
			System.out.println("arrayList�� �����ʹ� �����ϴ�");
		}
		if(arrayList.isEmpty()) {
			System.out.println("arrayList�� �������");
		}
		System.out.println(arrayList);
		arrayList = null; // arrayList ��ü�� ����.
		//System.out.println(arrayList.size());
	}
}






