package com.lect.ex03_store;
// ´ëÇĞ°¡ 2È£Á¡ : ±èÄ¡Âî°³-5,000 ºÎ´ëÂî°³-5,000 ºñºö¹ä-5,000 ¼ø´ë±¹-5,000  °ø±â¹ä-¹«·á
public class StoreNum2 implements HeadQuarterStore{
	private String name;
	public StoreNum2(String name) {
		this.name = name;
	}
	@Override
	public void kimchi() {
		System.out.println("±èÄ¡Âî°³ : 5,000¿ø");
	}
	@Override
	public void bude() {
		System.out.println("ºÎ´ëÂî°³ : 5,000¿ø");
	}
	@Override
	public void bibib() {
		System.out.println("ºñºö¹ä : 5,000¿ø");
	}
	@Override
	public void sunde() {
		System.out.println("¼ø´ë±¹ : ¹«·á");
	}
	@Override
	public void gongibab() {
		System.out.println("°ø±â¹ä : ¹«·á");
	}
	@Override
	public String getName() {
		return name;
	}
}





