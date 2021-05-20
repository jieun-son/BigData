package com.lec.condition;
// 컴퓨터가 발생한 점수(난수)의 학점 출력
public class Ex07_switchHakjum {
	public static void main(String[] args) {
		/* 0<= Math.random() <1
		 * 0<= Math.random()*101 < 101
		 * (int)(Math.random()*101) : 0~100사이의 정수 난수
		 */
		int score = (int)(Math.random()*101);
		switch (score/10) {
		case 10: case 9:
			System.out.println("A학점");	break;
		case 8 :System.out.println("B학점");break;
		case 7 :System.out.println("C학점");break;
		case 6 :System.out.println("D학점");break;
		default:
			System.out.println("F학점");
		} // switch
	}//main
}//class
