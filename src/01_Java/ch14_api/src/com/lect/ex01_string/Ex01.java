package com.lect.ex01_string;
public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		System.out.println(str1==str2? "str1과 str2는 같은 주소":"str1과 str2는 다른 주소");
		System.out.println(str2==str3? "str2와 str3은 같은 주소":"str2와 str3은 다른 주소");
		str1 = "java1";
		System.out.println(str1==str2? "str1과 str2는 같은 주소":"str1과 str2는 다른주소");
		if(str2.equals(str3)) {
			System.out.println("같은 스트링");
		}
		System.out.println(str2.equals(str3)? "같은 스트링":"다른 스트링");
	}
}




