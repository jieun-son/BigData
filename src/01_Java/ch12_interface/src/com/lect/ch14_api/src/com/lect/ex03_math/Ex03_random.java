package com.lect.ex03_math;
import java.util.Random;
public class Ex03_random {
	public static void main(String[] args) {
		System.out.println((int)(Math.random()*45)+1);
		Random random = new Random();
		System.out.println("int 난수 : " + random.nextInt());
		System.out.println("0~44까지 int 난수 : "+random.nextInt(45));
		System.out.println("double 난수 : "+random.nextDouble()); // Math.random()과 동일
		System.out.println("boolean 난수 : "+random.nextBoolean());
	}
}
