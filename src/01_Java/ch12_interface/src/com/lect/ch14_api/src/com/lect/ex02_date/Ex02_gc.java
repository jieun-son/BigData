package com.lect.ex02_date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ex02_gc {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal);
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // �ý����� 0������
		int day   = cal.get(Calendar.DAY_OF_MONTH);
		int week  = cal.get(Calendar.DAY_OF_WEEK); // 1(��) 2(��) 3(ȭ) ... 7(��)
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int hour   = cal.get(Calendar.HOUR);
		int ampm   = cal.get(Calendar.AM_PM); // 0(����) 1(����)
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d�� %d�� %d��", year, month, day);
		switch (week) {
		case 1:	System.out.print("�Ͽ��� "); break;
		case 2:	System.out.print("������ "); break;
		case 3:	System.out.print("ȭ���� "); break;
		case 4:	System.out.print("������ "); break;
		case 5:	System.out.print("����� "); break;
		case 6:	System.out.print("�ݿ��� "); break;
		case 7:	System.out.print("����� "); break;
		}
		System.out.printf("%d�� %d�� %d��(24�ð�) - ",hour24, minute, second);
		System.out.print(ampm==0? "����":"����");
		System.out.printf("%d�� %d�� %d��(12�ð�)\n", hour, minute, second);
		// tY(��) tm(��) td(��) tH(24��) tl(12�ð�) tp(����/����) tM(��) tS(��)
		// d(����) f(�Ǽ�) s(���ڿ�) c(����) b(true/false)
		System.out.printf("%tY�� %tm�� %td�� %tH�� %tM�� %tS��(24�ð�) %tp %tl�� %tM�� %tS��\n", 
				cal, cal, cal, cal, cal, cal, cal, cal, cal, cal);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� %1$tM�� %1$tS��(24�ð�) %1$tp %1$tl�� %1$tM�� %1$tS��\n", 
				 cal);
	}
}






