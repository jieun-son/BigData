package com.lect.ex3_set;
import java.util.Random;
import java.util.TreeSet;
public class Ex02_lottoNum {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		Random random = new Random();
		while(lotto.size()<6) {
			lotto.add(random.nextInt(45)+1); // 1~45사이의 정수 난수
		}
		System.out.println(lotto);
	}
}
