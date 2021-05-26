package com.lect.ex3_exceptionEx;
public class Friend {
	private String name;
	private String tel;
	public Friend() {}
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	@Override // ȫ�浿 - ***-****-9999
	public String toString() {
		String post = tel.substring(tel.lastIndexOf("-")+1);
		return name + "- ***-****-"+post;
	}
}
