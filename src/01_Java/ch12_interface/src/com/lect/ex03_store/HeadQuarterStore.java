package com.lect.ex03_store;
//인터페이스에는 상수와 추상메소드만
public interface HeadQuarterStore {
	public abstract void kimchi(); // 추상메소드(메소드 정의만 하고 구현부는 없는 메소드)
	public abstract void bude();
	public abstract void bibib();
	public abstract void sunde();
	public abstract void gongibab();
	public String getName();
}
