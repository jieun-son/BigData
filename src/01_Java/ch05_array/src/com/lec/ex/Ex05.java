package com.lec.ex;
import java.util.Scanner;
// 영희, 철수, 길동, 영수, 말자 키 입력받아 평균 => 가장 큰 학생이름과 키, 가장 작은 학생이름과 키
public class Ex05 {
	public static void main(String[] args) {
		String[] arrName = {"영희","철수","길동","영수","말자"};
		int[] arrHeight = new int[arrName.length];
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		for(int idx=0 ; idx<arrHeight.length ; idx++) {
			System.out.print(arrName[idx]+"의 키는?");
			arrHeight[idx] = scanner.nextInt();
			total += arrHeight[idx];
		}
		System.out.printf("평균키 : %d\n", total/arrHeight.length);
		System.out.printf("평균키 : %f\n", total/(double)arrHeight.length);
		scanner.close();
		int maxIdx=0, maxHeight=0; // 최장신을 구하기 위한 변수
		int minIdx=0, minHeight=999; // 최단신을 구하기 위한 변수
		for (int i=0 ; i<arrHeight.length ; i++) {
			if(arrHeight[i]>maxHeight) {
				maxHeight = arrHeight[i];
				maxIdx = i;
			}//if
			if(arrHeight[i]<minHeight) {
				minHeight = arrHeight[i];
				minIdx = i;
			}//if
		}//for
		System.out.printf("가장 작은 학생은 : %s, 키 : %d\n", arrName[minIdx], minHeight);
		System.out.printf("가장 큰 학생은 : %s, 키 : %d\n", arrName[maxIdx], maxHeight);
	}
}






