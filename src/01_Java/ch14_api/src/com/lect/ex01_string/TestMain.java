package com.lect.ex01_string;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("홍길동", "010-9999-9999", "05-24"),
				new Friend("신길동", "010-8888-8888", "08-14"),
				new Friend("마미숙", "010-7777-8888", "01-14")};
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("검색할 전화번호 뒷자리(단, 종료를 원하시면 x를 입력) ?");
			String searchTel = scanner.next();
			if(searchTel.equalsIgnoreCase("x")) {
				break;
			}
			boolean searchOk = false;
			for(int idx=0 ; idx<friends.length ; idx++) {
				String temp = friends[idx].getPhone();
				String postTel = temp.substring(temp.lastIndexOf("-")+1);
				if(postTel.equals(searchTel)) {
					System.out.println(friends[idx]); // Object의 toString()
					searchOk = true; // 중복된 뒷번호가 있을 경우
				}//if
			}//for
			if(!searchOk) {
				System.out.println("해당 전화번호의 친구는 없습니다");
			}
		}while(true);
		scanner.close();
	}
}
