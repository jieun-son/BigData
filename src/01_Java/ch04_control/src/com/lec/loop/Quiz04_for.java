package com.lec.loop;

public class Quiz04_for {
	public static void main(String[] args) {
		for(int i=1 ; i<10 ; i++) {
			for(int dansu=2 ; dansu<10 ; dansu++) {
				System.out.printf("%d * %d = %d\t", dansu, i, dansu*i);
			}
			System.out.println();//°³Çà
		}
	}
}
