package com.lect.ex6_quiz;

public class Customer {
	private String name;
	private String phone;
	private String birth;
	private String address;
	public Customer() { }
	public Customer(String name, String phone, String birth, String address) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.address = address;
	}
	@Override
	public String toString() {
		return name + "\t" + phone + "\t" + birth + "»ý\t" + address +"\r\n";
	}
}
