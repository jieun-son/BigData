package com.lect.ex10_lib;
public class TestMain {
	public static void main(String[] args) {
		Book book1 = new Book("890��-105��", "�ڹ�", "ȫ�浿");
		Book book2 = new Book("790��-101��","�ϵ�","�ϱ浿");
		book1.checkIn();// �������� ������ �ƴմϴ�
		book1.checkOut("��浿", "05-20");
		book1.checkOut("����", "05-20");
		System.out.println(book1);
		System.out.println(book2);
	}
}
