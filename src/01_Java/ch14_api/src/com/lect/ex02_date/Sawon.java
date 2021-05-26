package com.lect.ex02_date;
import java.text.SimpleDateFormat;
/* new Sawon(“a01”,”홍길동”,Part.COMPUTER)
데이터 : 사번, 이름, 부서(COMPUTER, PLANNING, DESIGN, ACCOUNTING, HUMANRESOURCES), 입사일.
생성자 : 사번, 이름, 부서만 매개변수로 들어감. 입사일은 객체생성 당일로 합니다
메소드: toString()*/
import java.util.Date;
import java.util.GregorianCalendar;
public class Sawon {
	private String num;
	private String name;
	private String part;
	private Date enterDate;
	public Sawon(String num, String name, String part) {
		this.num = num;
		this.name = name;
		this.part = part;
		enterDate = new Date();
	}
	public Sawon(String num, String name, String part, int y, int m, int d) {
		this.num = num;
		this.name = name;
		this.part = part;
		enterDate = new Date(new GregorianCalendar(y, m-1, d).getTimeInMillis());
	}
	@Override
	public String toString() {//2019년2월2일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월d일");
		String temp = sdf.format(enterDate);
		if(part.length()>10) {
			return "[사번]" + num + "\t[이름]" + name + "\t[부서]" + part + "\t[입사일]" + temp;
		}else {
			return "[사번]" + num + "\t[이름]" + name + "\t[부서]" + part + "\t\t[입사일]" + temp;
		}
	}
}











