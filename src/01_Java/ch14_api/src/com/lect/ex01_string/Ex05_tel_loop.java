package com.lect.ex01_string;
import java.util.Scanner;
public class Ex05_tel_loop {
	public static void main(String[] args) {
		String tel;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("��ȭ��ȣ�� ? ");
			tel = sc.next();
			if(tel.equalsIgnoreCase("x")) break;
			System.out.println("�Է��� ��ȭ��ȣ�� "+tel);
			System.out.print("¦����° ���ڿ� : "); 
			for(int i=0 ; i<tel.length() ; i++) {
				if(i%2 !=0) {
					System.out.print(tel.charAt(i));
				}else {
					System.out.print(' ');
				}
			}
			System.out.print("\n��ȭ��ȣ ���ٷδ�"); 
			for(int i=tel.length()-1 ; i>= 0 ; i--) {
				System.out.print(tel.charAt(i));
			}
			String preTel = tel.substring(0,tel.indexOf("-"));
			System.out.println("\n��ȭ��ȣ �Ǿ��ڸ��� "+preTel);
			String postTel = tel.substring(tel.lastIndexOf("-")+1);
			System.out.println("��ȭ��ȣ �ǵ��ڸ��� "+postTel);
		}//while
	}//main
}
