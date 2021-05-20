package com.lect.ex10_lib;
public class Book implements ILendable {
	private String bookNo;    // å û����ȣ ex.890��-105��
	private String bookTitle; // å ���� ex.�̰��̺�����
	private String writer;    // ����
	private String borrower;  // ������(�Է�)
	private String checkOutDate;//������(�Է�)
	private byte state;       // �������(0(STATE_NORMAL):���Ⱑ��, 
	                          //        1(STATE_BORROWED):������)
	public Book(String bookNo, String bookTitle, String writer) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	}
	// Book book1 = new Book("890��-105��","�̰��̺�����","ȫ�浿");
	// book1.checkOut("����", "05-20");
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if(state!=STATE_NORMAL) {
			System.out.println("�������� �����Դϴ�");
			return;
		}
		// ����ó�� ����
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = STATE_BORROWED;
		// ����ϼ��� �޼��� : "����" ������ ����Ǿ����ϴ�
		System.out.println("\""+bookTitle+"\" ������ ����Ǿ����ϴ�");
	}
	// book1.checkIn();
	@Override
	public void checkIn() {
		if(state!=STATE_BORROWED) {
			System.out.println("���� ���� ������ �ƴմϴ�. �̻��մϴ�");
		}else {
			// �ݳ� ó�� ����
			borrower = null;
			checkOutDate = null;
			state = STATE_NORMAL;
			System.out.println("\""+bookTitle+"\" ������ �ݳ��Ǿ����ϴ�");
		}
	}
	@Override
	public String toString() {
		String result = String.format("%s, %s�� ", bookTitle, writer);
		//result += state==STATE_NORMAL? "���Ⱑ��":"������";
		if(state == STATE_NORMAL) {
			result += " ���Ⱑ��";
		}else if(state == STATE_BORROWED) {
			result += " ������";
		}else {
			result += " ��������(�̻����)";
		}
		return result;
	}
	// getter
	public String getBookNo() {
		return bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getWriter() {
		return writer;
	}
	public String getBorrower() {
		return borrower;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public byte getState() {
		return state;
	}
}










