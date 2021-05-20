package com.lec.loop;
public class Quiz02_for {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++){
			if(i%2==0)
				sum += i;
		}//for
		System.out.println("1~10까지의 짝수의 합은 "+sum);
		System.out.println("\n= = = 다른 방법으로 구현 = = =\n");
		sum = 0;
		for(int i=2;i<=10;i+=2){
				sum += i;
		}//for
		System.out.println("1~10까지의 짝수의 합은 "+sum);
	}
}
