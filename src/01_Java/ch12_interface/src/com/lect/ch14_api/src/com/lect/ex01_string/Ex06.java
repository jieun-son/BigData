package com.lect.ex01_string;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		String[] tels = {"02-9999-9999",
				 		"010-8888-8888",
				 		"010-7777-8888"};
		Scanner sc = new Scanner(System.in);
		// 1회 검색하기(전화번호 뒷자리로 검색하여 전화번호 전체 출력)
		System.out.print("검색하고자하는 전화번호 뒷자리는 ?");
		String searchTel = sc.next();
		boolean searchOk = false; // 전화번호 뒷자리로 검색된 경우는 true
		for(int idx=0 ; idx<tels.length ; idx++) {
			String postTel = tels[idx].substring(tels[idx].lastIndexOf("-") + 1);
			if(searchTel.equals(postTel)) {
				System.out.println(tels[idx]);
				searchOk = true;
			}
		}
		if(!searchOk) {
			System.out.println("입력하신 전화번호는 없는 뒷자리입니다");
		}
		
	}
}













