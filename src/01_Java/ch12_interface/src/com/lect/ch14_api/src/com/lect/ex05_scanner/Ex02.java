package com.lect.ex05_scanner;
import java.util.Scanner;
import com.lect.ex04_object.Person;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ּҸ� �Է��ϼ���");
		String address = scanner.nextLine(); // ���ۿ� \n�� ������ �ձ��� ���ϰ� ���ۿ� �����ִ� ������ ����
		System.out.println("�Է��Ͻ� �ּҴ� "+address);
		System.out.print("�̸��� �Է��ϼ��� ");
		String name = scanner.nextLine();
		System.out.println("�Է��Ͻ� �̸��� "+name);
		Person p1 = new Person(9101012025874L);
		System.out.println(p1.equals(1));;
	}
}
