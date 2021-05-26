package com.lect.ex01_string;

public class Ex09_stringbuilder {
	public static void main(String[] args) {
		String st = "abc";
		StringBuilder str = new StringBuilder("abc");
		System.out.println("str의 해쉬코드 : "+str.hashCode());
		System.out.println("1."+str);
		str.append("def"); // abcdef
		System.out.println("2."+str);
		str.insert(3, "AAA"); // 3번째 index에 AAA를 추가 abcAAAdef
		System.out.println("3."+str);
		str.delete(3, 6); // 3번째부터 6번째 앞까지의 문자열 삭제 abcdef
		System.out.println("4."+str);		
		System.out.println("str의 해쉬코드 : "+str.hashCode()); // 문자열이 변해도 객체 생성되지 않고
		int builderSize = str.capacity();
		System.out.println("str의 가용크기 : "+builderSize);
		str.append("12345678901234567890");
		System.out.println("5."+str);
		System.out.println("str의 가용크기 : "+str.capacity());
		System.out.println("str의 해쉬코드 : "+str.hashCode());
	}
}
