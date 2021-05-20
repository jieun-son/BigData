package com.lec.ex;
// 배열 복사
public class Ex03_arraycopy {
  public static void main(String[] args) {
	int[] score = {100,20,30,40,50};
	int[] s = new int[score.length];
//	for(int i=0 ; i<score.length ; i++) {
//	  s[i] = score[i];
//	}
	System.arraycopy(score, 0, s, 0, s.length);
	for(int i=0 ; i<s.length ; i++) {
	  System.out.printf("s[%d]=%d, score[%d]=%d\n", i, s[i], i, score[i]);
	}
	s[0] = 90;
	System.out.println("s배열의 값 변경 후");
	for(int i=0 ; i<s.length ; i++) {
	  System.out.printf("s[%d]=%d, score[%d]=%d\n", i, s[i], i, score[i]);
	}
  }
}









