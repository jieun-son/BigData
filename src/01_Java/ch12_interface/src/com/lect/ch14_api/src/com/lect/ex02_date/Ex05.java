package com.lect.ex02_date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.lect.ex01_string.Friend;
public class Ex05 {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("홍길동", "010-9999-9999", "05-24"),
				new Friend("신길동", "010-8888-8888", "08-03"),
				new Friend("마미숙", "010-7777-8888", "01-14")};
		// 오늘 생일인 친구가 있으면 그 친구 정보 출력
		// 오늘 생일인 친구가 없으면 오늘 생일자는 없다고 출력
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String strToday = sdf.format(today);
		System.out.println("오늘은 "+strToday);
		boolean outOk = false; // 생일인자 출력 여부
		System.out.println("오늘 생일인 친구들입니다");
		for(int idx=0 ; idx<friends.length ; idx++) {
			if(strToday.equals(friends[idx].getBirthday())) {
				System.out.println(friends[idx]);
				outOk = true;
			}
		}
		if(!outOk) {
			System.out.println("오늘 생일인 사람이 없습니다");
		}
	}
}













