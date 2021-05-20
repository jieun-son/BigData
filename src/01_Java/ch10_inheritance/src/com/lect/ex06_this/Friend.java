package com.lect.ex06_this;
// this() : 현 클래스의 생성자 함수
// this. : 내 객체의
public class Friend {
	private String name;
	private String tel;
	public Friend() {
		System.out.println("매개변수 없는 생성자 함수");
	}
	public Friend(String name) {
		this(); // Friend()
		this.name = name;
		System.out.println("매개변수 하나짜리 생성자 함수");
	}
	public Friend(String name, String tel) {
		this(name); // Friend(name)호출
		this.tel = tel;
		System.out.println("매개변수 두개짜리 생성자 함수");
	}
}
