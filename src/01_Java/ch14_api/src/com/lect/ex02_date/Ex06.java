package com.lect.ex02_date;
import java.util.Calendar;
import com.lect.ex01_string.Friend;
public class Ex06 {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("홍길동", "010-9999-9999", "06-24"),
				new Friend("신길동", "010-8888-8888", "01-24"),
				new Friend("마미숙", "010-7777-8888", "01-14")};
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
//		String strMonth = (month<10)? "0"+month : ""+month;
		String strMonth = (month<10)? "0"+month : String.valueOf(month);
		String strDay = (day<10)? "0"+day : String.valueOf(day);
		String strToday = strMonth +"-"+strDay;
		System.out.println(strToday);
		boolean outOk = false;
		for(int idx=0 ; idx<friends.length ; idx++) {
			if(friends[idx].getBirthday().equals(strToday)) {
				System.out.println(friends[idx]);
				outOk = true;
			}
		}// for
		if(!outOk) {
			System.out.println("오늘이 생일인 사람이 없습니다");
		}
	}
}










