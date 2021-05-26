package com.lect.ex1_tryCatch;

public class Ex03_finally {
	public static void main(String[] args) {
		int[] iArr = {0,1,2};
		for(int i=0 ; i<=iArr.length ; i++) {
			try {
				System.out.println("iArr["+i+"] = "+iArr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("예외메세지 : "+e.getMessage());
			}finally {
				System.out.println("try절 실행후에도, catch절 샐행후에도 여기는 반드시 실행");
			}
		}
	}
}
