package com.lect.ex3_accessTest;
public class AccessTest {
	private int privateMember; // 같은 클래스 내에서만
	int defaultMember;         // 디폴트접근제한 : 같은 패키지에서만
	protected int protectedMember; // 같은패키지와 상속받은 클래스에서 가능
	public int publicMember;       // 외부에서 아무나

	private void privateMethod() {
		System.out.println("private 메소드");
	}
	void defaultMethod() {
		System.out.println("default 메소드");
	}
	protected void protectedMethod() {
		System.out.println("protected 메소드");
	}
	public void publicMethod() {
		System.out.println("public 메소드");
	}
}
