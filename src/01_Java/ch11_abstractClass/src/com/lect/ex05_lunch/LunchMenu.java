package com.lect.ex05_lunch;
public abstract class LunchMenu {
	private String typeString; // ���Ÿ��
	private int rice; // �Ұ�(1��)
	private int bulgogi; // �Ұ�Ⱚ(1��)
	private int soup;    // ����ᰪ(1��)
	private int banana;  // �ٳ�����(1��)
	private int milk;    // ������(1��)
	private int almond;  // �Ƹ�尪(1��)
	public LunchMenu(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.soup = soup;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	public abstract int calculate(); // �Ĵ��� �޼ҵ�
	// getter
	public String getTypeString() {
		return typeString;
	}
	public int getRice() {
		return rice;
	}
	public int getBulgogi() {
		return bulgogi;
	}
	public int getSoup() {
		return soup;
	}
	public int getBanana() {
		return banana;
	}
	public int getMilk() {
		return milk;
	}
	public int getAlmond() {
		return almond;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
}








