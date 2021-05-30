package com.lect.ex5_lib;
import java.util.Date;
import java.util.GregorianCalendar;
public class Test {
	public static void main(String[] args) {
		BookLib book1 = new BookLib("890¤¡-01","java","È«±æµ¿");
		BookLib book2 = new BookLib("890¤¡-11","oracle","È«±æµ¿");
		try {
			book1.checkOut("ÀÌºô·Á");
			book1.setCheckOutDate(new Date(new GregorianCalendar(2021, 4, 4).getTimeInMillis()));
			book1.checkIn();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			book2.checkIn();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
