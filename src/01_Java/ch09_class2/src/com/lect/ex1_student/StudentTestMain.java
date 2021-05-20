package com.lect.ex1_student;

public class StudentTestMain {
	public static void main(String[] args) {
		Student[] student = {new Student("정우성", 90, 90, 90),
							new Student("김하늘", 90, 90, 91),
							new Student("황정민", 80, 80, 80),
							new Student("강동원", 80, 80, 81),
							new Student("유아인", 70, 70, 70)};
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("\t\t\t\t성적표");
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
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}
}
