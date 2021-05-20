package com.lec.ex;
// ¸Þ¼Òµå
public class Ex02 {
	public static void main(String[] args) {
		int tot = sum(1, 10);
		System.out.println(evenOdd(tot));
		tot = sum(10, 100);
		System.out.println(tot);
		System.out.println(evenOdd(tot));
	}
	private static String evenOdd(int tot) {
		String result = tot%2==0 ? "Â¦¼ö":"È¦¼ö";
		return result;
	}
	private static int sum(int from, int to) {
		int result = 0;
		for(int i=from ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
}
