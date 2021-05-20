package com.lec.ex;
// 다차원 배열
public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {1,2,3}; // 1차원배열
		System.out.println(arr[1]);
		int[][] test = {{10,20,30},
						{40,50,60}}; // 2차원배열
		test[0][2] = 300;
		// 다차원 배열 test 출력
		for(int i=0 ; i<test.length ; i++) {
			for(int j=0 ; j<test[i].length ; j++) {
				System.out.printf("test[%d][%d] = %d\n",
						                i, j, test[i][j]);
			}
		}
	}
}






