package com.lect.ex3_set;
import java.util.HashSet;
import java.util.Iterator;
public class Ex01_HashSet {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("str0");
		hashset.add("str1");
		hashset.add("str2");
		System.out.println(hashset);
		System.out.println("hashset의 데이터 갯수 : "+hashset.size());
		hashset.add("str2");
		System.out.println("str2를 중복으로 add한 후 : "+hashset);
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
