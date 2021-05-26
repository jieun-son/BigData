package com.lect.ex03_math;
import java.util.Random;
// 배열에 lotto번호 6개 저장하기
public class Ex04_lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i=0 ; i<6 ; i++) {
			//lotto[i] = random.nextInt(45)+1;
			int temp = (int)(Math.random()*45)+1;
			boolean ok = true;
			for(int j=0; j<i ; j++) {
				if(temp==lotto[j]) { // 중복된 것 뽑힌 경우
					i--;
					ok = false;
					break; // for - j 반복문 빠져나감
				}
			}// for 발생된 난수가 전에 뽑은 난수인지 - 중복확인용
			if(ok) {
				lotto[i] = temp;
			}
		}
		for(int l : lotto) {
			System.out.print(l + "\t");
		}
	}
}
