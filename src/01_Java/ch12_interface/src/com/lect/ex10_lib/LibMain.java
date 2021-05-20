package com.lect.ex10_lib;
import java.util.Scanner;
public class LibMain {
	public static void main(String[] args) {
		Book[] books = {new Book("890��-101��", "�ڹ�", "ȫ�浿"),
				new Book("891��-102��", "����Ŭ", "��浿"),
				new Book("891��-103��", "��", "���浿"),
				new Book("891��-104��", "���̽�", "��浿"),
				new Book("891��-105��", "�ϵ�", "�ڱ浿")};
		Scanner sc = new Scanner(System.in);
		int fn, idx =0; // fn(��ɹ�ȣ) - 1:����, 2:�ݳ�, 3:������Ȳ, 0:����
		String bTitle, borrower, checkOutDate; // ������ ���ϴ� å�̸�, ������, ������
		do {
			System.out.print("1:���� | 2:�ݳ� | 3:������Ȳ�� | 0:����");
			fn = sc.nextInt();
			switch (fn) {
			case 0:
				break;
			case 1:
				// (1)å�̸��Է� -> (2)å��ȸ -> (3)åstateȮ�� -> 
				// (4)������,������ �Է� -> (5)����
				// (1) å�̸� �Է�
				System.out.print("������ å�̸���? ");
				bTitle = sc.next(); // ��Ʈ���� �Է� �ޱ� ���� next()
				// (2)å��ȸ
				for(idx=0 ; idx<books.length ;idx++) {
					if(books[idx].getBookTitle().equals(bTitle)) {
						break;
					}
				}
				if(idx==books.length) {
					System.out.println("�� ���������� �ش� ������ �����ϴ�. �˼��մϴ�");
				}else { // ������ idx��°�� �ִ�
					// �ڡڡڡڡڡڡڡڡڡڡڡ�
				}
				break;
			case 2:
				System.out.println("�ݳ������� ����");
				break;
			case 3:
				System.out.println("���� ��Ȳ�Դϴ�");
				for(Book book : books) {
					System.out.println(book);
				}
				break;
			default:
				System.out.println("��ȿ���� ���� ��ɹ�ȣ�Դϴ�");
			}
		}while(fn!=0);
		System.out.println("�ȳ��� ������");
		sc.close();
	}
}











