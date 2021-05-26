package com.lect.ex01_string;
public class Ex02 {
	public static void main(String[] args) {
		String str1 = "abcXabc";
		String str2 = new String("ABCXabc");
		String str3 = "    ja va  ";
		System.out.println("1."+str1.concat(str2));//abcXabcABCXabc
		System.out.println("2."+str1.substring(3));//3번째부터 끝까지 Xabc
		System.out.println("3."+str1.substring(3,6));//3번째부터 6번째앞글자까지 Xab
		System.out.println("4."+str1.length()); // 문자열길이 7
		System.out.println("5."+str1.toUpperCase()); // 대문자로 ABCXABC
		System.out.println("6."+str1.toLowerCase()); // 소문자로 abcxabc
		System.out.println("7."+str1.charAt(3)); // 3번째 index의 글자 X
		System.out.println("8."+str1.indexOf("b")); //1 "b"가 처음 나오는 index
		System.out.println("9."+str1.indexOf("홍길동")); // 없는 스트링의 경우 -1
		System.out.println("10."+str1.indexOf("b", 3));//3번째 index부터 처음나오는 "b"의 index
		str1 = "abcXabc"; str2="ABCXabc";
		System.out.println("11."+str1.lastIndexOf("b"));// 마지막부터 "b" index => 5
		System.out.println("12."+str1.equals(str2)); // false||true
		System.out.println("13."+str1.equalsIgnoreCase(str2)); //대소문자 구분하지 않고 비교
		System.out.println("14."+str3.trim()); // 좌우 space 제거 ja va
		System.out.println("15."+str1.replace('a', '★'));//a를 ★로 수정
		System.out.println("16."+str1.replace("abc", "바꿔")); // abc를 바꿔로 수정
		System.out.println("17."+str1.replaceAll("abc", "바꿔"));
		System.out.println("최종 str1="+str1);
	}
}





