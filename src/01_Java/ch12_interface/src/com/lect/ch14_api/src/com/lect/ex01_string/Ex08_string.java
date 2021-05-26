package com.lect.ex01_string;
public class Ex08_string {
	public static void main(String[] args) {
		String str = "Hello~";
		String str1 = "Hello~";
		System.out.println("str의 해쉬코드 : "+str.hashCode());
		System.out.println("str1의 해쉬코드 : "+str1.hashCode());
		System.out.println(str==str1 ? "str과 str1은 같은 주소":"str과 str1은 다른 주소");
		str = "hello"; // str의 내용이 변경되면 다시 String 객체 생성
		System.out.println("str의 해쉬코드 : "+str.hashCode());
		System.out.println("str1의 해쉬코드 : "+str1.hashCode());
		System.out.println(str==str1? "str과 str1은 같은 주소":"str과 str1은 다른 주소");
	}
}
