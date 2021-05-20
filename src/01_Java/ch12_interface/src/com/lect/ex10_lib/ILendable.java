package com.lect.ex10_lib;
public interface ILendable {
	public byte STATE_BORROWED  = 1; // 대출중
	public byte STATE_NORMAL    = 0; // 대출가능
	public void checkOut(String borrower, String checkOutData); // 도서 대출
	public void checkIn(); //반납	
}
