package com.lec.loop;
import java.util.Scanner;
// 컴퓨터가 발생한 로또번호(1~45) 한개를 맞추는 프로그램 
public class Ex12_DoWhilelotto {
	public static void main(String[] args) {
//		0<=Math.random()    < 1
//		0<=Math.random()*45 < 45
//		(int)(Math.random()*45) ; 0~44까지의 정수 난수		
		int su, lotto;
		Scanner scanner = new Scanner(System.in);
		lotto = (int)(Math.random()*45) +1;
		do {
			System.out.print("1~45사이의 숫자를 맞춰 보세요");
			su = scanner.nextInt();
			if(su==lotto) {
				break;
			}else if(su<lotto) {
				System.out.println("입력하신 수보다 큰 수예요");
			}else {
				System.out.println("입력하신 수보다 작은 수예요");
			}
		}while(true);
		System.out.println("축하축하 로또 번호를 맞추셨습니다");
	}
}



