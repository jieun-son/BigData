package com.lect.ex11_account;
//new CheckingAccount("111-111","홍길동",1000,"1111-2222-3333-4444")
//new CheckingAccount("111-111","홍길동","1111-2222-3333-4444")
public class CheckingAccount extends Account {
	private String cardNo;
	public CheckingAccount(String accountNo, String ownerName, String cardNo) {
		super(accountNo, ownerName);
		this.cardNo = cardNo;
	}
	public CheckingAccount(String accountNo, String ownerName, int balance,
			String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	public void pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)) {// 올바른 카드 번호 입력
			if(getBalance()>=amount) { // 지불가능
				setBalance(getBalance() - amount);
//				balance = balance -amount;
				System.out.printf("%s(%s)님 %d원 지불하여 잔액 %d\n",
						getAccountNo(), getOwnerName(), amount, getBalance());
			}else { // 지불불가능(잔액부족)
				System.out.printf("%s(%s)님 잔액 %d원으로 %d원 지불 불가\n",
						getAccountNo(), getOwnerName(), getBalance(), amount);
			}
		}else { // 틀린 카드번호 입력
			System.out.println("올바른 카드 번호를 입력하세요");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}












