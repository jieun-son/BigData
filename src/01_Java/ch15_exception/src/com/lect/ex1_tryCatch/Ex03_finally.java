package com.lect.ex1_tryCatch;

public class Ex03_finally {
	public static void main(String[] args) {
		int[] iArr = {0,1,2};
		for(int i=0 ; i<=iArr.length ; i++) {
			try {
				System.out.println("iArr["+i+"] = "+iArr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���ܸ޼��� : "+e.getMessage());
			}finally {
				System.out.println("try�� �����Ŀ���, catch�� �����Ŀ��� ����� �ݵ�� ����");
			}
		}
	}
}
