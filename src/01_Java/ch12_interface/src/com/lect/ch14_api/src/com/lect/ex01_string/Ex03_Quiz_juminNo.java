package com.lect.ex01_string;
import java.util.Scanner;
public class Ex03_Quiz_juminNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֹι�ȣ ?");
		String jumin = scanner.next();
//		char gender = jumin.charAt(7);
//		String msg = (gender=='1' || gender =='3') ? "����" :
//			(gender=='2' || gender=='4')? "����" : "����";
		
//		String gender = jumin.substring(7,8);
//		String msg = (gender.equals("1")||gender.equals("3")) ? "����":
//			(gender.equals("2") || gender.equals("4"))? "����":"����";
		
		int gender = Integer.parseInt(jumin.substring(7,8));
		String msg = (gender==1 || gender ==3) ? "����" :
			(gender==2 || gender==4)? "����" : "����";
		System.out.printf("����� %s�Դϴ�",msg);
		scanner.close();
	}
}
