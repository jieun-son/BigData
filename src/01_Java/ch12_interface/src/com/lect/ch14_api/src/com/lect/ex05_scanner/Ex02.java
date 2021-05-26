package com.lect.ex05_scanner;
import java.util.Scanner;
import com.lect.ex04_object.Person;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("주소를 입력하세요");
		String address = scanner.nextLine(); // 버퍼에 \n이 나오는 앞까지 취하고 버퍼에 남아있는 내용은 제거
		System.out.println("입력하신 주소는 "+address);
		System.out.print("이름을 입력하세요 ");
		String name = scanner.nextLine();
		System.out.println("입력하신 이름은 "+name);
		Person p1 = new Person(9101012025874L);
		System.out.println(p1.equals(1));;
	}
}
