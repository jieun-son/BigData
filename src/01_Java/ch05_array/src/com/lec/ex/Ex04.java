package com.lec.ex;
// ������ �迭
public class Ex04 {
	public static void main(String[] args) {
		int[] arr = {1,2,3}; // 1�����迭
		System.out.println(arr[1]);
		int[][] test = {{10,20,30},
						{40,50,60}}; // 2�����迭
		test[0][2] = 300;
		// ������ �迭 test ���
		for(int i=0 ; i<test.length ; i++) {
			for(int j=0 ; j<test[i].length ; j++) {
				System.out.printf("test[%d][%d] = %d\n",
						                i, j, test[i][j]);
			}
		}
	}
}






