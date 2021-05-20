package com.lect.ex8_static_student;
public class StaticStudentMain {
	public static void main(String[] args) {
		Student[] student = { new Student("정우성", 90, 90, 90), 
							new Student("김하늘", 90, 90, 91),
							new Student("황정민", 80, 80, 80), 
							new Student("강동원", 80, 80, 81), 
							new Student("유아인", 70, 70, 70) };
		String[] title = { "번호","이름", "국어", "영어", "수학", "총점", "평균" };
		int[] tot = new int[5];
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("\t\t성적표");
		System.out.println("------------------------------------------------------");
		for (String t : title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		for (Student s : student) {
			s.infoPrint();
			tot[0] += s.getKor();
			tot[1] += s.getEng();
			tot[2] += s.getMat();
			tot[3] += s.getTot();
			tot[4] += s.getAvg();
		}
		System.out.println("------------------------------------------------------");
		System.out.print("\t총점\t");
		for(int t : tot) {
			System.out.print(t+"\t");
		}
		System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

	}
}
