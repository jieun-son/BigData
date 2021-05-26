package com.lect.ex04_object;
import java.util.Random;
public class Ex02_cardTestMain {
	public static void main(String[] args) {
		Card[] card = {new Card('♡', 3),new Card('♡', 1),
				new Card('♡', 2), new Card('◇', 2)};
		Random random = new Random();
		char[] kinds = {'♡', '◇', '♧', '♤'};
		Card com = new Card(kinds[random.nextInt(4)], random.nextInt(13)+1);
		System.out.println(com);
		for(int idx=0 ; idx<card.length ; idx++) {
			if(card[idx].equals(com)) {
				System.out.println(idx+"번째와 일치합니다 - "+ card[idx]);
			}else {
				System.out.println(idx+"번째와 틀립니다 - "+ card[idx]);
			}
		}
	}
}
