package com.lect.ex03_store;
// ±èÄ¡Âî°³-4,500 ºÎ´ëÂî°³-5,000 ºñºö¹ä-6,000 ¼ø´ë±¹-¾ÈÆÈ¾Æ °ø±â¹ä-1,000¿ø
public class StoreNum1 implements HeadQuarterStore {
	private String name;
	public StoreNum1(String name) {
		this.name = name;
	}
	@Override
	public void kimchi() {
		System.out.println("±èÄ¡Âî°³ : 4,500¿ø");
	}
	@Override
	public void bude() {
		System.out.println("ºÎ´ëÂî°³ : 5,000¿ø");
	}
	@Override
	public void bibib() {
		System.out.println("ºñºö¹ä : 6,000¿ø");
	}
	@Override
	public void sunde() {
		System.out.println("¼ø´ë±¹ ¾È ÆÈ¾Æ");
	}
	@Override
	public void gongibab() {
		System.out.println("°ø±â¹ä : 1000¿ø");
	}
	@Override
	public String getName() {
		return name;
	}
}
