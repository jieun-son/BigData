package com.lect.ex05_scanner;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요? ");
		int age = scanner.nextInt(); // 
		System.out.println("입력하신 나이는 "+age);
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next(); // 버퍼에 처음 나오는 \n은 무시하고 whiteSpace나오기 전까지 취함
		System.out.println("입력하신 이름은 "+name);
		System.out.print("주소를 입력하세요");
		scanner.nextLine(); // 버퍼를 지우기 위해
		String address = scanner.nextLine(); // 버퍼에 \n이 나오는 앞까지 취하고 버퍼에 남아있는 내용은 제거
		System.out.println("입력하신 주소는 "+address);
	}
}
