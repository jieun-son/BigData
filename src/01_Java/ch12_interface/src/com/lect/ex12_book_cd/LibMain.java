package com.lect.ex12_book_cd;
import java.util.Scanner;
public class LibMain {
  public static void main(String[] args) {
	BookLib[] books = { new BookLib("a01", "javajava", "�ſ��"), 
				new BookLib("a02", "oracle", "�ƹ���"),
				new BookLib("a03", "hadoop", "ȫ�浿"), 
				new BookLib("a04", "bigData", "�̸���"),
				new BookLib("a05", "python", "����") };
	CDLib[] cds = { new CDLib("c01", "javajava", "a01"), 
				new CDLib("c02", "ITtrend", null), 
				new CDLib("c03", "oracle", "a02") };
	Scanner sc = new Scanner(System.in);
	int fn, idx;
	String bTitle, cdTitle, borrower, checkOutDate; // å����,cd����, ������,������
	do {
		System.out.print("1:å���� | 2:CD����  | 3:å�ݳ� | 4:CD�ݳ� | 5:������CD��Ȳ | 0:���� ");
		fn = sc.nextInt();
		switch(fn) {
		case 1 : // å�̸�->å��ȸ ->�ش�å�� ����->������,������->å����
		    	// å�̸� �Է�
			System.out.print("������ å�̸���?");
			bTitle = sc.next(); // ��Ʈ���� �ޱ� ���� next()
			// å��ȸ
			for(idx=0 ; idx<books.length ; idx++) {
				if(bTitle.equals(books[idx].getBookTitle())) {
					break;
				}
			}//for
			// å��ȸ���� å�� ã�Ҵ��� ��ã�Ҵ��� ���� ���� ����
			if(idx==books.length) {
				System.out.println("�� ���������� �ش� ������ �����ϴ�");
			}else if(books[idx].getState()==ILendable.STATE_BORROWED){
				System.out.println(bTitle+" ������ �������Դϴ�");
			}else {
				//���� �����̴� ������, ������ �Է¹ް� ��������
				System.out.print("�������� ?");
				borrower = sc.next();
				System.out.print("�������� ?");
				checkOutDate = sc.next();
				books[idx].checkOut(borrower, checkOutDate);
				String bookNo = books[idx].getBookNo();
				for(idx=0 ; idx<cds.length ; idx++) {
					if(bookNo.equals(cds[idx].getBookNo())) {
						break;
					}//if
				}//for
				if(idx!=cds.length) {
					System.out.print("������ ���� CD�� �ֽ��ϴ�. CD �����ұ�� (Y/N)?");
					String answer = sc.next();
					if(answer.equals("Y") || answer.equals("y")) {
						cds[idx].checkOut(borrower, checkOutDate);
					} //if(���� CD�� ������ ���� ���)
				}// if(���� CD�� �ִ� ���)
			}//if
			break;
		case 2 : // CD�̸�->CD��ȸ ->�ش�CD�� ����->������,������->CD����
			// å�̸� �Է�
			System.out.print("������ CD��?");
			cdTitle = sc.next(); // ��Ʈ���� �ޱ� ���� next()
			// å��ȸ
			for(idx=0 ; idx<cds.length ; idx++) {
				if(cdTitle.equals(cds[idx].getCdTitle())) {
					break;
				}
			}//for
			// å��ȸ���� å�� ã�Ҵ��� ��ã�Ҵ��� ���� ���� ����
			if(idx==cds.length) {
				System.out.println("�� ���������� �ش� CD�� �����ϴ�");
			}else if(cds[idx].getState()==ILendable.STATE_BORROWED){
				System.out.println(cdTitle+" CD�� �������Դϴ�");
			}else {
				//���� �����̴� ������, ������ �Է¹ް� ��������
				System.out.print("�������� ?");
				borrower = sc.next();
				System.out.print("�������� ?");
				checkOutDate = sc.next();
				cds[idx].checkOut(borrower, checkOutDate);
			}//if
			break;
		case 3: // å�̸�->å��ȸ->å�ݳ� 
			System.out.print("�ݳ��� å�̸���?");
			bTitle = sc.next();
			for(idx=0 ; idx<books.length ; idx++) {
				if(bTitle.equals(books[idx].getBookTitle())) {
					break;
				}
			}//for
			if(idx==books.length) {
				System.out.println("�ش絵���� �� �������� å�� �ƴմϴ�");
			}else {
				books[idx].checkIn();
			}//if
			break;
		case 4: // CD�̸�->CD��ȸ->CD�ݳ� 
			System.out.print("�ݳ��� CD�̸���?");
			cdTitle = sc.next();
			for(idx=0 ; idx<cds.length ; idx++) {
				if(cdTitle.equals(cds[idx].getCdTitle())) {
					break;
				}
			}//for
			if(idx==cds.length) {
				System.out.println("�ش� CD�� �� �������� CD�� �ƴմϴ�");
			}else {
				cds[idx].checkIn();
			}//if
			break;
		case 5: // for���� �̿��ؼ� �������� �� CD����
			for(BookLib book : books) {
				System.out.println(book);
			}//for
			for(CDLib cd : cds) {
				System.out.println(cd);
			}
		}//switch
	}while(fn!=0);
	sc.close();
	System.out.println("�ȳ��� ������");
  }
}
