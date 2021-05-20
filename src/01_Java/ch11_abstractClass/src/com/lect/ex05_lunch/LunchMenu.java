package com.lect.ex05_lunch;
public abstract class LunchMenu {
	private String typeString; // 어린이타입
	private int rice; // 쌀값(1인)
	private int bulgogi; // 불고기값(1인)
	private int soup;    // 국재료값(1인)
	private int banana;  // 바나나값(1인)
	private int milk;    // 우유값(1인)
	private int almond;  // 아몬드값(1인)
	public LunchMenu(int rice, int bulgogi, int soup, int banana, int milk, int almond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.soup = soup;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	public abstract int calculate(); // 식대계산 메소드
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








