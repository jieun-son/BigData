package com.lect.ex3_exceptionEx;

public class FriendTestMain {
	public static void main(String[] args) {
		Friend kim = new Friend();
		Friend lee = new Friend("�̱浿", "010-9876-1234");
		System.out.println(kim.toString());
		System.out.println(lee);
	}
}
