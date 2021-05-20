package com.lec.loop;
// 1~20까지의 2와 3의 배수가 아닌 수의 합
public class Homework01 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++) {
			if((i%2!=0) && (i%3!=0)) {
				sum += i;
			}
		}
		System.out.println("1~20까지의 2와 3의 배수가 아닌 수의 합은 "+sum);
	}
}
