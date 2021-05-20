package com.lect.ex7_staticfinal;
import java.util.Scanner;
import constant.Price;
public class Test {
	public static void main(String[] args) {
		int r = 10;
		double area = Price.PI * r * r;
		System.out.println(area);
		Scanner scanner = new Scanner(System.in);
		r = scanner.nextInt();
		area = Price.PI * r * r;
		System.out.println(area);
	}
}
