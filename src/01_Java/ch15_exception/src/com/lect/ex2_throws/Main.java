package com.lect.ex2_throws;
public class Main {
	public static void main(String[] args) {
		try {
			new ThrowsEx();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
