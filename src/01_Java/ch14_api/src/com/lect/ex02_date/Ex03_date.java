package com.lect.ex02_date;
import java.util.Date;
public class Ex03_date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		int year = date.getYear()+1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		System.out.println(year+"�� "+month+"�� "+day);
		// tY(��) tm(��) td(��) tH(24��) tl(12�ð�) tp(����/����) tM(��) tS(��)
		// d(����) f(�Ǽ�) s(���ڿ�) c(����) b(true/false)
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� %1$tM�� %1$tS��", date);
	}
}
