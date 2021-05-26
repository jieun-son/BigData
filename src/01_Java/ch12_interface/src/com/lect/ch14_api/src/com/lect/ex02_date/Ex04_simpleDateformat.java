package com.lect.ex02_date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Ex04_simpleDateformat {
	public static void main(String[] args) {
		Date              now1 = new Date();
		Calendar          now2 = Calendar.getInstance();
		GregorianCalendar now3 = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a h시 m분 s초");
		/* yyyy(년도 4자리) yy(년도 2자리) M(5) MM(05) d(9) dd(09)
		 * E(요일)  a(오전/오후) H(24시간) h(12시간) m(분) s(초) 
		 * w(이번 년도에 몇번째 주인지) W(이번 월에 몇번째 주인지) D(올해의 몇번째 날) */
		System.out.println(sdf.format(now1));
		System.out.println(sdf.format(now2.getTime()));
		System.out.println(sdf.format(now3.getTime()));
	}
}
