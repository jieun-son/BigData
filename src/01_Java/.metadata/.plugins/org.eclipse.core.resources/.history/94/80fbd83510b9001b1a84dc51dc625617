package com.lect.ex01_store;

public class TestMain2 {
	public static void main(String[] args) {
//		HeadQuarterStore st = new HeadQuarterStore("= 본사 = ");
//		HeadQuarterStore st1 = new StoreNum1("= 주택가1호점 =");
//		HeadQuarterStore st2 = new StoreNum2("= 대학가 2호점 =");
//		HeadQuarterStore st3 = new StoreNum3("= 증권가 3호점 =");
//		HeadQuarterStore[] store = {st, st1, st2, st3};
		
		HeadQuarterStore[] store = { 
									new StoreNum1("= 주택가1호점 ="),
									new StoreNum2("= 대학가 2호점 ="),
									new StoreNum3("= 증권가 3호점 =")
		};
		for(HeadQuarterStore s : store) {  // 확장 for문
			System.out.println(s.getName());
			s.kimchi();
			s.bude();
			s.bibib();
			s.sunde();
			s.gongibab();
		}
		for(int idx=0 ; idx<store.length ; idx++) { // 일반for문
			System.out.println(store[idx].getName());
			store[idx].kimchi();
			store[idx].bude();
			store[idx].bibib();
			store[idx].sunde();
			store[idx].gongibab();
		}
	}
}











