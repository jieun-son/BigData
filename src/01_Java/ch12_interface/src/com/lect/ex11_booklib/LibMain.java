package com.lect.ex11_booklib;
import java.util.Scanner;
public class LibMain {
	public static void main(String[] args) {
		BookLib[] books = {new BookLib("890ㄱ-101나", "자바", "홍길동"),
				new BookLib("891ㄱ-102나", "오라클", "김길동"),
				new BookLib("891ㄱ-103나", "웹", "마길동"),
				new BookLib("891ㄱ-104나", "파이썬", "김길동"),
				new BookLib("891ㄱ-105나", "하둡", "박길동")};
		Scanner sc = new Scanner(System.in);
		int fn, idx =0; // fn(기능번호) - 1:대출, 2:반납, 3:도서현황, 0:종료
		String bTitle, borrower, checkOutDate; // 대출을 원하는 책이름, 대출인, 대출일
		do {
			System.out.print("1:대출 | 2:반납 | 3:도서현황들 | 0:종료");
			fn = sc.nextInt();
			switch (fn) {
			case 0:
				break;
			case 1:
				// (1)책이름입력 -> (2)책조회 -> (3)책state확인 -> 
				// (4)대출인,대출일 입력 -> (5)대출
				// (1) 책이름 입력
				System.out.print("대출할 책이름은? ");
				bTitle = sc.next(); // 스트링을 입력 받기 위해 next()
				// (2)책조회
				for(idx=0 ; idx<books.length ;idx++) {
					if(books[idx].getBookTitle().equals(bTitle)) {
						break;
					}
				}
				if(idx==books.length) {
					System.out.println("본 도서관에는 해당 도서가 없습니다. 죄송합니다");
				}else if(books[idx].getState()==BookLib.STATE_BORROWED){ //(3)상태체크
					System.out.println(bTitle+" 도서는 대출중입니다");
				}else {
					// (4) 대출인, 대출일 입력 받기
					System.out.print("대출인은 ?");
					borrower = sc.next();
					System.out.print("대출일은 ?");
					checkOutDate = sc.next();
					// (5)대출
					books[idx].checkOut(borrower, checkOutDate);
				}
				break;
			case 2:
				// (1) 책입력 -> (2)책조회 -> (3)반납
				// (1) 책입력
				System.out.print("반납할 책 이름은? ");
				bTitle = sc.next();
				// (2) 책조회
				for(idx=0 ; idx<books.length ; idx++) {
					if(bTitle.equals(books[idx].getBookTitle())) {
						break;
					}
				}
				if(idx==books.length) {
					System.out.println("해당 도서는 본 도서관의 책이 아닙니다");
				}else { // (3) 반납
					books[idx].checkIn();
				}
				break;
			case 3:
				System.out.println("도서 현황입니다");
				for(BookLib book : books) {
					System.out.println(book);
				}
				break;
			default:
				System.out.println("유효하지 않은 기능번호입니다");
			}
		}while(fn!=0);
		System.out.println("안녕히 가세요");
		sc.close();
	}
}











