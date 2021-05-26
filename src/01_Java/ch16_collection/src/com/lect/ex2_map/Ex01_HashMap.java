package com.lect.ex2_map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class Ex01_HashMap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		System.out.println(list.get(0));
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(11, "str11");
		hashmap.put(20, "str20");
		hashmap.put(33, "str30");
		System.out.println(hashmap.get(20));
		System.out.println("remove �� : "+hashmap);
		hashmap.remove(20);
		System.out.println("remove �� : "+hashmap);
		hashmap.clear();
		System.out.println(hashmap.isEmpty()? "������ ��� ����":"������ ����");
		hashmap.put(0, "Hong gildong");
		hashmap.put(1, "Kim dongil");
		hashmap.put(2, "Lee soonsin");
		hashmap.put(3, "Yu ain");
		Iterator<Integer> iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key +"�� �����ʹ� "+hashmap.get(key));
		}
	}
}






