package com.lect.ex11_account;

public class CreditLineAccount extends CheckingAccount {
	private int creditLine; // 카드 한도

	public CreditLineAccount(String accountNo, String ownerName, String cardNo, int creditLine) {
		super(accountNo, ownerName, cardNo);
		this.creditLine = creditLine;
	}

	public CreditLineAccount(String accountNo, String ownerName, int balance, String cardNo, int creditLine) {
		super(accountNo, ownerName, balance, cardNo);
		this.creditLine = creditLine;
	}

	// kim = new CreditLineAccount("11-11","홍길동",1000,"1111-2222-3333-4444",2000);
	// kim.pay("1111-1111-2222-3333",1500);
	@Override
	public void pay(String cardNo, int amount) {
		if (getCardNo().equals(cardNo)) { // 올바른 카드 번호 입력
			if (creditLine >= amount) { // pay 가능
				creditLine -= amount;
				System.out.printf("%s님 수정된 현재 한도액 : %d\n", getOwnerName(), 
						creditLine);
			} else { // 한도 초과해서 pay 불가
				System.out.printf("%s님 현재 한도 %d원으로 한도 초과됨", getOwnerName(), 
						creditLine);
			}
		} else { // 틀린 카드 번호 입력
			System.out.println("카드 번호가 틀립니다. 떼끼");
		}
	}
	public int getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
}