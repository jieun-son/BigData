package com.lec.condition;
import java.util.Scanner;
public class Ex04_ifExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������� �Է� : ");
		int kor = scanner.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = scanner.nextInt();
		System.out.print("���������� �Է� : ");
		int math = scanner.nextInt();
		double avg = (kor+eng+math)/3.;
		if(kor>=avg){
			System.out.printf("����� ���(%.1f)���� %.1f�����̷� �����ϴ�\n", 
					avg, kor-avg);
		} else {
			System.out.printf("����� ���(%.1f)���� %.f�� ���̷� �����ϴ�\n",
					avg, avg-kor);
		}
		if(eng>=avg){
			System.out.printf("����� ���(%.1f)���� %.1f�����̷� �����ϴ�\n", 
					avg, eng-avg);
		}else {
			System.out.printf("����� ���(%.1f)���� %.f�� ���̷� �����ϴ�\\n", 
					avg, avg-eng);
		}
		if(math>=avg){
			System.out.printf("������ ���(%.1f)���� %.1f�����̷� �����ϴ�\n", 
					avg, math-avg);
		}else {
			System.out.printf("������ ���(%.1f)���� %.f�� ���̷� �����ϴ�\\n", 
					avg, avg-math);
		}
		scanner.close();
	}
}
