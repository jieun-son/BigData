package com.lect.ex11_booklib;
public class BookLib extends BookInfo implements ILendable {
	private String borrower;  // ������(�Է�)
	private String checkOutDate;//������(�Է�)
	private byte state;       // �������(0(STATE_NORMAL):���Ⱑ��, 
	                          //        1(STATE_BORROWED):������)
	public BookLib(String bookNo, String bookTitle, String writer) {
		super(bookNo, bookTitle, writer);
//		borrower = null;
//		checkOutDate = null;
//		state = STATE_NORMAL;
	}
	// BookLib book1 = new BookLib("890��-105��","�̰��̺�����","ȫ�浿");
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
		System.out.println("\""+getBookTitle()+"\" ������ ����Ǿ����ϴ�");
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
			System.out.println("\""+getBookTitle()+"\" ������ �ݳ��Ǿ����ϴ�");
		}
	}
	@Override
	public String toString() {
		String result = String.format("\"%s\"\t%s��\t", getBookTitle(), getWriter());
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










