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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a h�� m�� s��");
		/* yyyy(�⵵ 4�ڸ�) yy(�⵵ 2�ڸ�) M(5) MM(05) d(9) dd(09)
		 * E(����)  a(����/����) H(24�ð�) h(12�ð�) m(��) s(��) 
		 * w(�̹� �⵵�� ���° ������) W(�̹� ���� ���° ������) D(������ ���° ��) */
		System.out.println(sdf.format(now1));
		System.out.println(sdf.format(now2.getTime()));
		System.out.println(sdf.format(now3.getTime()));
	}
}
