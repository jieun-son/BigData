package com.lect.ex1_student;

public class StudentTestMain {
	public static void main(String[] args) {
		Student[] student = {new Student("���켺", 90, 90, 90),
							new Student("���ϴ�", 90, 90, 91),
							new Student("Ȳ����", 80, 80, 80),
							new Student("������", 80, 80, 81),
							new Student("������", 70, 70, 70)};
		String[] title = {"�̸�","����","����","����","����","���"};
		System.out.println("�������������������������������������������������������������������");
		System.out.println("\t\t\t\t����ǥ");
		System.out.println("\t--------------------------------------------------");
//		for(int i=0 ; i<title.length ; i++) {
//			System.out.print("\t "+title[i]);
//		}
		for(String t : title) {
			System.out.print("\t"+t);
		}
		System.out.println();
		System.out.println("\t--------------------------------------------------");
		for(Student s : student) {
			s.infoPrint();
		}
		System.out.println("�������������������������������������������������������������������");
		
	}
}
