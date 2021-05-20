package com.lec.quiz;
// 국영수점수의 총점, 평균 출력
public class Quiz5 {
	public static void main(String[] args) {
		int kor=99, eng=99, mat=100;
		int sum = kor + eng + mat;
		double avg = sum/3.;
		System.out.printf("국어 = %d, 영어=%d, 수학=%d\n",kor, eng, mat);
		System.out.printf("총점 = %d\n", sum);
		System.out.printf("총점 = %.2f\n", avg);
	}
}
