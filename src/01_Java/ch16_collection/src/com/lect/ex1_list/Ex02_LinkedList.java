package com.lect.ex1_list;
import java.util.ArrayList;
import java.util.LinkedList;
public class Ex02_LinkedList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("str0"); // 0�� �ε���
		linkedList.add("str1"); // 1�� �ε��� -> 2�� �ε���
		linkedList.add("str2"); // 2�� �ε��� -> 3�� �ε���
		linkedList.add(1, "1111");// 1�� �ε���
		System.out.println(linkedList);
		for(String data : linkedList) {
			System.out.println(data);
		}
		linkedList.remove("1111");
		System.out.println(" - remove �� - ");
		for(int i=0 ; i<linkedList.size() ; i++) {
			System.out.println(linkedList.get(i));
		}
		linkedList.clear();
		System.out.println(linkedList.isEmpty()? "�������":"������ �ִ�");
	}
}







