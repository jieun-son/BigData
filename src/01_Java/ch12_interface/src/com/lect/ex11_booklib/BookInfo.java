package com.lect.ex11_booklib;
public class BookInfo {
	private String bookNo;    // å û����ȣ ex.890��-105��
	private String bookTitle; // å ���� ex.�̰��̺�����
	private String writer;    // ����
	public BookInfo() { }
	public BookInfo(String bookNo, String bookTitle, String writer){
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	public String getBookNo() {return bookNo;}
	public String getBookTitle() {return bookTitle;}
	public String getWriter() {return writer;}
}