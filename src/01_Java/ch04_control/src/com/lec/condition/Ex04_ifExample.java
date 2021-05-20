package com.lec.condition;
import java.util.Scanner;
public class Ex04_ifExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력 : ");
		int math = scanner.nextInt();
		double avg = (kor+eng+math)/3.;
		if(kor>=avg){
			System.out.printf("국어는 평균(%.1f)보다 %.1f점차이로 높습니다\n", 
					avg, kor-avg);
		} else {
			System.out.printf("국어는 평균(%.1f)보다 %.f점 차이로 낮습니다\n",
					avg, avg-kor);
		}
		if(eng>=avg){
			System.out.printf("영어는 평균(%.1f)보다 %.1f점차이로 높습니다\n", 
					avg, eng-avg);
		}else {
			System.out.printf("영어는 평균(%.1f)보다 %.f점 차이로 낮습니다\\n", 
					avg, avg-eng);
		}
		if(math>=avg){
			System.out.printf("수학은 평균(%.1f)보다 %.1f점차이로 높습니다\n", 
					avg, math-avg);
		}else {
			System.out.printf("수학은 평균(%.1f)보다 %.f점 차이로 낮습니다\\n", 
					avg, avg-math);
		}
		scanner.close();
	}
}
