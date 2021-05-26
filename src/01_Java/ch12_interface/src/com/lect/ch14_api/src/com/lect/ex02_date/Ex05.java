package com.lect.ex02_date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.lect.ex01_string.Friend;
public class Ex05 {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("ȫ�浿", "010-9999-9999", "05-24"),
				new Friend("�ű浿", "010-8888-8888", "08-03"),
				new Friend("���̼�", "010-7777-8888", "01-14")};
		// ���� ������ ģ���� ������ �� ģ�� ���� ���
		// ���� ������ ģ���� ������ ���� �����ڴ� ���ٰ� ���
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String strToday = sdf.format(today);
		System.out.println("������ "+strToday);
		boolean outOk = false; // �������� ��� ����
		System.out.println("���� ������ ģ�����Դϴ�");
		for(int idx=0 ; idx<friends.length ; idx++) {
			if(strToday.equals(friends[idx].getBirthday())) {
				System.out.println(friends[idx]);
				outOk = true;
			}
		}
		if(!outOk) {
			System.out.println("���� ������ ����� �����ϴ�");
		}
	}
}













