package com.lect.ex1_student;
public class StudentTestMain2 {
	public static void main(String[] args) {
		Student[] student = {new Student("정우성", 90, 90, 90),
							new Student("김하늘", 90, 90, 91),
							new Student("황정민", 80, 80, 80),
							new Student("강동원", 80, 80, 81),
							new Student("유아인", 70, 70, 70)};
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		// 각 과목별 총점들을 누적(0:국어누적, 1 index:영어누적, 2:수학누적, 3:총점누적, 4:평균누적)
		// 배열 tot와 avg엔 0이나 0.0으로 초기화
		int[] tot = new int[5]; 
		double[] avg = new double[5]; // 각 과목별 평균들 저장
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
			// 각 과목별 총점들을 누적(0:국어누적, 1 index:영어누적, 2:수학누적, 3:총점누적, 4:평균누적)
			tot[0] += s.getKor(); //tot[0] = tot[0] + s.getKor();
			tot[1] += s.getEng();
			tot[2] += s.getMat();
			tot[3] += s.getTot();
			tot[4] += s.getAvg();
			
		}
		System.out.println("\t--------------------------------------------------");
		System.out.print("\t총점");
		for(int idx=0 ; idx<avg.length ; idx++) { // 평균들 계산
			avg[idx] = tot[idx] / student.length;
			System.out.print("\t "+tot[idx]);
		}
		System.out.print("\n\t평균");
		for(double a : avg) {
			System.out.print("\t"+a);
		}
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}
}
