package com.lect.ex11_booklib;
public class BookInfo {
	private String bookNo;    // 책 청구번호 ex.890ㄱ-105나
	private String bookTitle; // 책 제목 ex.이것이베개다
	private String writer;    // 저자
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