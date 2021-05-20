package com.lec.condition;
import java.util.Scanner;
// 사용자로부터 점수를 입력받아 학점를 출력
public class Ex06_switchHakjum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수는 ?");
		int score = scanner.nextInt();
		int temp = (score==100)? score-1:score; //100점
		temp = (temp>=-9 && temp<=-1)? temp-10 : temp;// -9~-1점 사이일 경우
		switch(temp/10) {
		case 9 : System.out.println("A학점");break;
		case 8 : System.out.println("B학점");break;
		case 7 : System.out.println("C학점");break;
		case 6 : System.out.println("D학점");break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("F학점");break;
		default:
			System.out.println("유효하지 않는 점수");
		}
//		if(score>=90 && score<=100) {
//			System.out.println("A학점");
//		}else if(80<=score && score<90){
//			System.out.println("B학점");
//		}else if(70<=score && score<80) {
//			System.out.println("C학점");
//		}else if(60<=score && score<70) {
//			System.out.println("D학점");
//		}else if(0<=score && score<60) {
//			System.out.println("F학점");
//		}else {
//			System.out.println("유효하지 않는 점수입니다");
//		}
	}
}
