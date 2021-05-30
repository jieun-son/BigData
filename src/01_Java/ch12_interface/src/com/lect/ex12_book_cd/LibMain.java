package com.lect.ex12_book_cd;
import java.util.Scanner;
public class LibMain {
  public static void main(String[] args) {
	BookLib[] books = { new BookLib("a01", "javajava", "신용권"), 
				new BookLib("a02", "oracle", "아무개"),
				new BookLib("a03", "hadoop", "홍길동"), 
				new BookLib("a04", "bigData", "이마이"),
				new BookLib("a05", "python", "서블리") };
	CDLib[] cds = { new CDLib("c01", "javajava", "a01"), 
				new CDLib("c02", "ITtrend", null), 
				new CDLib("c03", "oracle", "a02") };
	Scanner sc = new Scanner(System.in);
	int fn, idx;
	String bTitle, cdTitle, borrower, checkOutDate; // 책제목,cd제목, 대출인,대출일
	do {
		System.out.print("1:책대출 | 2:CD대출  | 3:책반납 | 4:CD반납 | 5:도서및CD현황 | 0:종료 ");
		fn = sc.nextInt();
		switch(fn) {
		case 1 : // 책이름->책조회 ->해당책의 상태->대출인,대출일->책대출
		    	// 책이름 입력
			System.out.print("대출할 책이름은?");
			bTitle = sc.next(); // 스트링을 받기 위해 next()
			// 책조회
			for(idx=0 ; idx<books.length ; idx++) {
				if(bTitle.equals(books[idx].getBookTitle())) {
					break;
				}
			}//for
			// 책조회에서 책을 찾았는지 못찾았는지 보고 대출 진행
			if(idx==books.length) {
				System.out.println("본 도서관에는 해당 도서가 없습니다");
			}else if(books[idx].getState()==ILendable.STATE_BORROWED){
				System.out.println(bTitle+" 도서는 대출중입니다");
			}else {
				//대출 가능이니 대출인, 대출일 입력받고 대출진행
				System.out.print("대출인은 ?");
				borrower = sc.next();
				System.out.print("대출일은 ?");
				checkOutDate = sc.next();
				books[idx].checkOut(borrower, checkOutDate);
				String bookNo = books[idx].getBookNo();
				for(idx=0 ; idx<cds.length ; idx++) {
					if(bookNo.equals(cds[idx].getBookNo())) {
						break;
					}//if
				}//for
				if(idx!=cds.length) {
					System.out.print("도서에 딸린 CD가 있습니다. CD 대출할까요 (Y/N)?");
					String answer = sc.next();
					if(answer.equals("Y") || answer.equals("y")) {
						cds[idx].checkOut(borrower, checkOutDate);
					} //if(딸린 CD를 대출을 원할 경우)
				}// if(딸린 CD가 있는 경우)
			}//if
			break;
		case 2 : // CD이름->CD조회 ->해당CD의 상태->대출인,대출일->CD대출
			// 책이름 입력
			System.out.print("대출할 CD은?");
			cdTitle = sc.next(); // 스트링을 받기 위해 next()
			// 책조회
			for(idx=0 ; idx<cds.length ; idx++) {
				if(cdTitle.equals(cds[idx].getCdTitle())) {
					break;
				}
			}//for
			// 책조회에서 책을 찾았는지 못찾았는지 보고 대출 진행
			if(idx==cds.length) {
				System.out.println("본 도서관에는 해당 CD가 없습니다");
			}else if(cds[idx].getState()==ILendable.STATE_BORROWED){
				System.out.println(cdTitle+" CD는 대출중입니다");
			}else {
				//대출 가능이니 대출인, 대출일 입력받고 대출진행
				System.out.print("대출인은 ?");
				borrower = sc.next();
				System.out.print("대출일은 ?");
				checkOutDate = sc.next();
				cds[idx].checkOut(borrower, checkOutDate);
			}//if
			break;
		case 3: // 책이름->책조회->책반납 
			System.out.print("반납할 책이름은?");
			bTitle = sc.next();
			for(idx=0 ; idx<books.length ; idx++) {
				if(bTitle.equals(books[idx].getBookTitle())) {
					break;
				}
			}//for
			if(idx==books.length) {
				System.out.println("해당도서는 본 도서관의 책이 아닙니다");
			}else {
				books[idx].checkIn();
			}//if
			break;
		case 4: // CD이름->CD조회->CD반납 
			System.out.print("반납할 CD이름은?");
			cdTitle = sc.next();
			for(idx=0 ; idx<cds.length ; idx++) {
				if(cdTitle.equals(cds[idx].getCdTitle())) {
					break;
				}
			}//for
			if(idx==cds.length) {
				System.out.println("해당 CD는 본 도서관의 CD가 아닙니다");
			}else {
				cds[idx].checkIn();
			}//if
			break;
		case 5: // for문을 이용해서 도서상태 및 CD상태
			for(BookLib book : books) {
				System.out.println(book);
			}//for
			for(CDLib cd : cds) {
				System.out.println(cd);
			}
		}//switch
	}while(fn!=0);
	sc.close();
	System.out.println("안녕히 가세요");
  }
}
