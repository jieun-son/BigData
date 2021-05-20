package com.lec.ex;

public class TodayEx4 {
	public static void main(String[] args) {
		int money = 2680;
		int[] coinUnit = {500,100,50,10};
		for(int i=0 ; i<coinUnit.length ; i++) {
			System.out.println(coinUnit[i]+"원짜리 동전 " + (money/coinUnit[i]) + "개");
			money %= coinUnit[i]; //money = money%coinUnit[i];
		}
//		for(int coin : coinUnit) {
//			System.out.println(coin+"원짜리 동전 " +
//					(money/coin)+"개 ");
//			money %= coin; //money = money%coin;
//		}
		
	}
}
