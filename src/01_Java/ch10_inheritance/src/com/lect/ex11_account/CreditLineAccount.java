package com.lect.ex11_account;

public class CreditLineAccount extends CheckingAccount {
	private int creditLine; // ī�� �ѵ�

	public CreditLineAccount(String accountNo, String ownerName, String cardNo, int creditLine) {
		super(accountNo, ownerName, cardNo);
		this.creditLine = creditLine;
	}

	public CreditLineAccount(String accountNo, String ownerName, int balance, String cardNo, int creditLine) {
		super(accountNo, ownerName, balance, cardNo);
		this.creditLine = creditLine;
	}

	// kim = new CreditLineAccount("11-11","ȫ�浿",1000,"1111-2222-3333-4444",2000);
	// kim.pay("1111-1111-2222-3333",1500);
	@Override
	public void pay(String cardNo, int amount) {
		if (getCardNo().equals(cardNo)) { // �ùٸ� ī�� ��ȣ �Է�
			if (creditLine >= amount) { // pay ����
				creditLine -= amount;
				System.out.printf("%s�� ������ ���� �ѵ��� : %d\n", getOwnerName(), 
						creditLine);
			} else { // �ѵ� �ʰ��ؼ� pay �Ұ�
				System.out.printf("%s�� ���� �ѵ� %d������ �ѵ� �ʰ���", getOwnerName(), 
						creditLine);
			}
		} else { // Ʋ�� ī�� ��ȣ �Է�
			System.out.println("ī�� ��ȣ�� Ʋ���ϴ�. ����");
		}
	}
	public int getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
}