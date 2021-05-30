package com.lect.ex12_book_cd;

public class BookLib extends BookInfo implements ILendable{
	private String borrower;
	private String checkOutDate;
	private byte state;
	
	public BookLib(String bookNo, String bookTitle, String writer) {
		super(bookNo, bookTitle, writer);
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
	}

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
		System.out.println("\""+getBookTitle()+"\" ������ ����Ǿ����ϴ�");
	}

	@Override
	public void checkIn() {
		if(state!=STATE_BORROWED) {
			System.out.println("���� ���� ������ �ƴմϴ�. �̻��մϴ�");
		}else {
			// �ݳ� ó�� ����
			borrower = null;
			checkOutDate = null;
			state = STATE_NORMAL;
			System.out.println("\""+getBookTitle()+"\" ������ �ݳ��Ǿ����ϴ�");
		}
	}
	@Override
	public String toString() {
		String result = String.format("\"%s\"\t%s��", getBookTitle(), getWriter());
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
