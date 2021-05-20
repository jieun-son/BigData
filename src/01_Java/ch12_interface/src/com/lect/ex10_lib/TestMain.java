package com.lect.ex10_lib;
public class TestMain {
	public static void main(String[] args) {
		Book book1 = new Book("890¤¡-105³ª", "ÀÚ¹ö", "È«±æµ¿");
		Book book2 = new Book("790¤¡-101°¡","ÇÏµÓ","ÇÏ±æµ¿");
		book1.checkIn();// ´ëÃâÁßÀÎ µµ¼­°¡ ¾Æ´Õ´Ï´Ù
		book1.checkOut("±è±æµ¿", "05-20");
		book1.checkOut("±è±è±è", "05-20");
		System.out.println(book1);
		System.out.println(book2);
	}
}
