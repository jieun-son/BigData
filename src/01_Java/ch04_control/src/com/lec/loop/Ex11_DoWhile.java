package com.lec.loop;
// 0 1 2 3 4 5 6 7 8 9 10
public class Ex11_DoWhile {
	public static void main(String[] args) {
		int cnt = 0;
		do {
			System.out.print(cnt + ", ");
			if(cnt==10)break;
			cnt++;
		}while(true);
	}
}
