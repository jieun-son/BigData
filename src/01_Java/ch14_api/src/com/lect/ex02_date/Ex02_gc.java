package com.lect.ex02_date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ex02_gc {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal);
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 시스템은 0월부터
		int day   = cal.get(Calendar.DAY_OF_MONTH);
		int week  = cal.get(Calendar.DAY_OF_WEEK); // 1(일) 2(월) 3(화) ... 7(토)
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int hour   = cal.get(Calendar.HOUR);
		int ampm   = cal.get(Calendar.AM_PM); // 0(오전) 1(오후)
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d년 %d월 %d일", year, month, day);
		switch (week) {
		case 1:	System.out.print("일요일 "); break;
		case 2:	System.out.print("월요일 "); break;
		case 3:	System.out.print("화요일 "); break;
		case 4:	System.out.print("수요일 "); break;
		case 5:	System.out.print("목요일 "); break;
		case 6:	System.out.print("금요일 "); break;
		case 7:	System.out.print("토요일 "); break;
		}
		System.out.printf("%d시 %d분 %d초(24시간) - ",hour24, minute, second);
		System.out.print(ampm==0? "오전":"오후");
		System.out.printf("%d시 %d분 %d초(12시간)\n", hour, minute, second);
		// tY(년) tm(월) td(일) tH(24시) tl(12시간) tp(오전/오후) tM(분) tS(초)
		// d(정수) f(실수) s(문자열) c(문자) b(true/false)
		System.out.printf("%tY년 %tm월 %td일 %tH시 %tM분 %tS초(24시간) %tp %tl시 %tM분 %tS초\n", 
				cal, cal, cal, cal, cal, cal, cal, cal, cal, cal);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초(24시간) %1$tp %1$tl시 %1$tM분 %1$tS초\n", 
				 cal);
	}
}






