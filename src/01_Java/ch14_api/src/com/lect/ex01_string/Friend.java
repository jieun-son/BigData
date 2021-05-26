package com.lect.ex01_string;

public class Friend {
	private String name;
	private String phone;
	private String birthday;
	public Friend(String name, String phone, String birthday) {
		this.name = name;
		this.phone = phone;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getBirthday() {
		return birthday;
	}
	@Override
	public String toString() {
		return "이  름 : " + name + "\n핸드폰 : " + phone + "\n생  일 : " + birthday + "\n";
	}
	
}
