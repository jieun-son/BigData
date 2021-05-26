package com.lect.ex01_string;
import java.util.Scanner;
public class Ex05_tel_loop {
	public static void main(String[] args) {
		String tel;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("전화번호는 ? ");
			tel = sc.next();
			if(tel.equalsIgnoreCase("x")) break;
			System.out.println("입력한 전화번호는 "+tel);
			System.out.print("짝수번째 문자열 : "); 
			for(int i=0 ; i<tel.length() ; i++) {
				if(i%2 !=0) {
					System.out.print(tel.charAt(i));
				}else {
					System.out.print(' ');
				}
			}
			System.out.print("\n전화번호 꺼꾸로는"); 
			for(int i=tel.length()-1 ; i>= 0 ; i--) {
				System.out.print(tel.charAt(i));
			}
			String preTel = tel.substring(0,tel.indexOf("-"));
			System.out.println("\n전화번호 맨앞자리는 "+preTel);
			String postTel = tel.substring(tel.lastIndexOf("-")+1);
			System.out.println("전화번호 맨뒷자리는 "+postTel);
		}//while
	}//main
}
