package com.lec.ex;
public class Ex03 {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		int tot = ar.sum(10);
		System.out.println(ar.evenOdd(tot));
		tot = ar.sum(10,100);
		System.out.println(ar.evenOdd(tot));
	}
}
