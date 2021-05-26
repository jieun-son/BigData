package com.lect.ex4_newException;
public class Main {
	public static void main(String[] args){
		Account hong = new Account("110-1", "È«±æµ¿", 50000);
		Account hong1 = new Account("110-2", "È«ÀÏ");
		Account hong2 = new Account();
		hong2.setAccountNo("110-9");
		hong2.setOwnerName("½Å±æµ¿");
		hong.deposit(20000);
		System.out.println(hong);
		try {
			hong1.withdraw(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(hong1);
		hong2.deposit(10000);
		try {
			hong2.withdraw(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(hong2);
	}
}
