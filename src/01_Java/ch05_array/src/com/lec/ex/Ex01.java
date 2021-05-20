package com.lec.ex;
public class Ex01 {
	public static void main(String[] args) {
//		int i = 10; // 변수의 선언과 초기화
		int[] iArr = {10,20,30,40,50}; // 1.배열 변수 선언과 초기화
		iArr[0] = 90; // 배열은 index로 접근 (index:0~4)
		for(int idx=0 ; idx<iArr.length ; idx++) {//iArr.length : 배열크기
			System.out.println(iArr[idx]);
		}
		int[] iArr2 = new int[5]; // 2.배열변수선언과 배열메모리 공간확보(배열 객체 생성)
		iArr2[0]=99;
		for(int idx=0 ; idx<iArr2.length ; idx++) { // 일반for문을 이용한 배열 접근
			System.out.println("iArr2 배열의 "+idx+"번째값 : "+iArr2[idx]);
		}
		int[] iArr3; // 3. 배열 변수만 선언
		iArr3 = new int[3]; // 0 0 0
		for(int temp : iArr3) { // 확장for문을 이용한 배열 접근하여 출력(sysout)
			System.out.println(temp);
		}
//		for(int temp : iArr3) { // 확장 for문을 이용한 배열 값 변경 불가
//			temp = 999;
//		}
		for(int idx=0 ; idx<iArr3.length ; idx++) { // 일반for문을 이용한 값 변경
			iArr3[idx] = 999;
		}
		for(int temp : iArr3) {
			System.out.println(temp);
		}
	}
}














