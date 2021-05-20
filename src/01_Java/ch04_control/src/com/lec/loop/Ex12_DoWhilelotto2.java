package com.lec.loop;
import java.util.Scanner;
// 컴퓨터가 발생한 로또번호(1~45) 한개를 맞추는 프로그램 (범위를 줄여가며 질문)
public class Ex12_DoWhilelotto2 {
	public static void main(String[] args) {
		int su, lotto;
		int min=1, max=45; // 최소값, 최대값 설정
		Scanner scanner = new Scanner(System.in);
		lotto = (int)(Math.random()*45) +1;
		do {
			System.out.printf("%d~%d 사이의 숫자를 맞춰 보세요", min, max);
			su = scanner.nextInt();
			if(su==lotto) {
				break;
			}else if(su<lotto) {
				min = su + 1;
			}else {
				max = su -1;
			}
		}while(true);
		System.out.println("축하축하 로또 번호를 맞추셨습니다");
	}
}



