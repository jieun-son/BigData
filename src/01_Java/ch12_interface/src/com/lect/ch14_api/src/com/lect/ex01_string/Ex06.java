package com.lect.ex01_string;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		String[] tels = {"02-9999-9999",
				 		"010-8888-8888",
				 		"010-7777-8888"};
		Scanner sc = new Scanner(System.in);
		// 1ȸ �˻��ϱ�(��ȭ��ȣ ���ڸ��� �˻��Ͽ� ��ȭ��ȣ ��ü ���)
		System.out.print("�˻��ϰ����ϴ� ��ȭ��ȣ ���ڸ��� ?");
		String searchTel = sc.next();
		boolean searchOk = false; // ��ȭ��ȣ ���ڸ��� �˻��� ���� true
		for(int idx=0 ; idx<tels.length ; idx++) {
			String postTel = tels[idx].substring(tels[idx].lastIndexOf("-") + 1);
			if(searchTel.equals(postTel)) {
				System.out.println(tels[idx]);
				searchOk = true;
			}
		}
		if(!searchOk) {
			System.out.println("�Է��Ͻ� ��ȭ��ȣ�� ���� ���ڸ��Դϴ�");
		}
		
	}
}












