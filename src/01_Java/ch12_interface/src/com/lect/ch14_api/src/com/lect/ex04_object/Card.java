package com.lect.ex04_object;
public class Card {
	private char kind; // �� �� �� ��
	private int num;   // 1~13 (a:1, 2~10, king11~13)
	public Card(char kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "ī��� "+kind+" "+num;
	}
	@Override
	public boolean equals(Object obj) {
		// c1.equals(c2) => c1�� c2�� ���� ī��� true�� ����, Ʋ�� ī��� false
		if(obj!=null && obj instanceof Card) {
			boolean kindChk = kind == ((Card)obj).kind;
			boolean numChk = num == ((Card)obj).num;
			return kindChk && numChk;
//			return (kind==((Card)obj).kind) && (num== ((Card)obj).num);
		}else {
			return false;
		}//if
	}//equals
}










