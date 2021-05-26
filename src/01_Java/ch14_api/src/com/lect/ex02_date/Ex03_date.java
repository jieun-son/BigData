package com.lect.ex02_date;
import java.util.Date;
public class Ex03_date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		int year = date.getYear()+1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		System.out.println(year+"년 "+month+"월 "+day);
		// tY(년) tm(월) td(일) tH(24시) tl(12시간) tp(오전/오후) tM(분) tS(초)
		// d(정수) f(실수) s(문자열) c(문자) b(true/false)
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초", date);
	}
}
