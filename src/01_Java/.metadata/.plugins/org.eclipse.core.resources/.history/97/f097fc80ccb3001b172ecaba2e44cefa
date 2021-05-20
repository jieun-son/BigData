package com.lect.ex4_account;
/*  은행계좌(Account) 클래스 설계
데이터(속성) : 계좌번호(accountNo), 예금주(ownerName), 잔액(balance)
기능(메소드) : 예금하다(deposit). 인출하다(withdraw). 정보 출력하다(info) */
public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	public Account() {}
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposit(int money) { // 예금은 무조건
		balance += money;
	}
	public void withdraw(int money) { // 잔액 부족시 "떼끼" 출력
		if(balance >= money) {
			balance -= money; // balance = balance - money;
		}else {
			System.out.println("잔액이 부족하여 인출이 안 됩니다. 떼끼");
		}
	}
	public void info() {
		System.out.println("계좌번호:"+accountNo+", "+ownerName+
						"님 잔액은 "+balance);
	}
	// accountNo, ownerName, balance setter & getter
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
}
