package com.lect.ex3_man;
public class ManMain {
	public static void main(String[] args) {
		 Man kim = new Man(30, 180, 63, "010-9999-9999");
		 Man kang = new Man(173, 60, "010-9999-9999");
		 Man yi = new Man(160, 70);
		 Man[] student = {kim, kang, yi};
		 yi.setPhoneNum("010-7777-7777");
		 student[1].setPhoneNum("010-8888-8888"); // kang.setPhoneNum("010-8888-8888")
		 double bmi = kim.calculateBMI();
		 if(bmi>24.5) {
			 System.out.println(kim.getPhoneNum()+"���� ���̴� �ǰ������ϼ���");
		 }else {
			 System.out.println(kim.getPhoneNum()+"���� �ǰ��� ���̾�Ʈ����");
		 }
		 for(int idx=0 ; idx<student.length ; idx++) {
			 bmi = student[idx].calculateBMI();
			 if(bmi>24.5) {
				 System.out.println(student[idx].getPhoneNum()+"�� ���̴� �ǰ������ϼ���");
			 }else {
				 System.out.println(student[idx].getPhoneNum()+"�� �ǰ��� ���̾�Ʈ ����");
			 }
		 }
		 
		 
		 
	}
}
