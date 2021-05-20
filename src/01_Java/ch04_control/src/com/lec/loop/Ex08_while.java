package com.lec.loop;
// i가 1일때 누적합은 1이다
// ..
// i가 10일때 누적합은 55이다
public class Ex08_while {
	public static void main(String[] args) {
		int tot = 0;
		int i = 1;
		while(i<11) {
			tot += i; // tot = tot+i
			System.out.printf("i가 %d일때 누적합은 %d이다\n", 
					i, tot);
			i++;
		}
//		for(int i=1 ; i<11 ; i++) {
//			tot += i; // tot = tot+i
//			System.out.printf("i가 %d일때 누적합은 %d이다\n", 
//					i, tot);
//		}
	}
}
