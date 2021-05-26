package com.lect.ex01_string;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("ȫ�浿", "010-9999-9999", "05-24"),
				new Friend("�ű浿", "010-8888-8888", "08-14"),
				new Friend("���̼�", "010-7777-8888", "01-14")};
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("�˻��� ��ȭ��ȣ ���ڸ�(��, ���Ḧ ���Ͻø� x�� �Է�) ?");
			String searchTel = scanner.next();
			if(searchTel.equalsIgnoreCase("x")) {
				break;
			}
			boolean searchOk = false;
			for(int idx=0 ; idx<friends.length ; idx++) {
				String temp = friends[idx].getPhone();
				String postTel = temp.substring(temp.lastIndexOf("-")+1);
				if(postTel.equals(searchTel)) {
					System.out.println(friends[idx]); // Object�� toString()
					searchOk = true; // �ߺ��� �޹�ȣ�� ���� ���
				}//if
			}//for
			if(!searchOk) {
				System.out.println("�ش� ��ȭ��ȣ�� ģ���� �����ϴ�");
			}
		}while(true);
		scanner.close();
	}
}
