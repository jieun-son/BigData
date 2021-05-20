package com.lec.loop;
/* 출력결과
 *
 **
 ***
 ****
 *****
 */
public class Ex03_for {
	public static void main(String[] args) {
		for(int j=0 ; j<5 ; j++) {
			for(int i=0 ; i<=j ; i++) {
				System.out.print('*');
			}//for-i
			System.out.println();//개행
		}//for-j
	}//main
}
