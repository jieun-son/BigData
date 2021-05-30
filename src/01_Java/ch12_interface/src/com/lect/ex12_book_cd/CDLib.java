package com.lect.ex12_book_cd;

public class CDLib extends CDInfo implements ILendable{
	private String borrower;
	private String checkOutDate;
	private byte state;
	public CDLib(String cdNo, String cdTitle, String bookNo) {
		super(cdNo, cdTitle, bookNo);
		this.borrower = null;
		this.checkOutDate = null;
		this.state = STATE_NORMAL;
	}
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if(state!=STATE_NORMAL) {
			System.out.println("�������� CD�Դϴ�");
			return;
		}
		// ����ó�� ����
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		state = STATE_BORROWED;
		// ����ϼ��� �޼��� : "XX" CD�� ����Ǿ����ϴ�
		System.out.println("\""+getCdTitle()+"\" CD�� ����Ǿ����ϴ�");
	}
	@Override
	public void checkIn() {
		if(state!=STATE_BORROWED) {
			System.out.println("���� ���� CD�� �ƴմϴ�. �̻��մϴ�");
		}else {
			// �ݳ� ó�� ����
			borrower = null;
			checkOutDate = null;
			state = STATE_NORMAL;
			System.out.println("\""+getCdTitle()+"\" CD�� �ݳ��Ǿ����ϴ�");
		}
	}
	@Override
	public String toString() {
		String result = String.format("\"%s\"\t%s\t", getCdTitle(), getCdNo());
		result += (getBookNo()!=null)? getBookNo()+"������ ���� CD\t" : "\t\t";
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
