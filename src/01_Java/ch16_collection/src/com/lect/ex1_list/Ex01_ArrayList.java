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
		arrayList.add("str0"); // 0번 인덱스
		arrayList.add("str1"); // 1번 인덱스 -> 2번 인덱스로
		arrayList.add("str2"); // 2번 인덱스 -> 3번 인덱스로
		arrayList.add(1, "11111"); // 1번 인덱스
		arrayList.set(1, "str1"); // 1번 인덱스의 값을 수정
		for(String arr : arrayList) {
			System.out.print(arr + "\t");
		}
		System.out.println("\n - remove한 후에 - ");
		arrayList.remove(1); // 1번째 인덱스의 데이터 삭제. 2->1, 3->2
		arrayList.remove(arrayList.size()-1); // 맨마지막 인덱스 데이터 삭제
		for(int i=0 ; i<arrayList.size() ; i++) {
			System.out.printf("%d번째 인덱스 값은 : %s\t", i, arrayList.get(i));
		}
		System.out.println();//개행
		System.out.println(arrayList);
		arrayList.clear(); // arrayList의 모든 데이터 삭제
		if(arrayList.size()==0) {
			System.out.println("arrayList의 데이터는 없습니다");
		}
		if(arrayList.isEmpty()) {
			System.out.println("arrayList가 비워졌다");
		}
		System.out.println(arrayList);
		arrayList = null; // arrayList 객체를 지움.
		//System.out.println(arrayList.size());
	}
}






