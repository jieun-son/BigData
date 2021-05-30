package com.lect.ex4_quiz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class TestMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer, name, phone, address;
		HashMap<String, Customer> customers = new HashMap<String, Customer>();
		do {
			System.out.print("ȸ������ �����Ͻðڽ��ϱ�(Y/N)? ");
			answer = scanner.next();
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")){ // ȸ������ ����
				System.out.print("�����Ͻ� ȸ���� �̸��� ?");
				name = scanner.next();
				System.out.print("�����Ͻ� ȸ���� ��ȭ��ȣ�� ?");
				phone = scanner.next();
				Iterator<String> iterator = customers.keySet().iterator();
				boolean phoneChk = false;
				while(iterator.hasNext()) {
					String key = iterator.next();
					if(customers.get(key).getPhone().equals(phone)) {
						phoneChk = true;
						break;
					}
				}//while - ȸ�� ��Ͽ� �ش� ��ȭ��ȣ�� �ִ���?
				if(phoneChk) {
					System.out.println("�̹� ���ԵǾ� �ִ� ��ȭ��ȣ�Դϴ�. ��ȭ��ȣ�� �ߺ��� �� �����ϴ�");
					continue;
				}
				System.out.print("�����Ͻ� ȸ���� �ּҴ� ?");
				scanner.nextLine(); // ��������� �뵵
				address = scanner.nextLine();
//				Customer temp = new Customer(name, phone, address);
//				customers.put(phone, temp);
				customers.put(phone, new Customer(name, phone, address));
			}
		}while(true);
		scanner.close();
		if(customers.isEmpty()) {
			System.out.println("�� ������ ȸ���� �����ϴ� ��");
		}else {
			System.out.println("�� ������ ȸ�� ����Ʈ ��� ��");
			Iterator<String> iterator = customers.keySet().iterator();
			while(iterator.hasNext()) {
				System.out.println(customers.get(iterator.next()));
			}//while - ȸ�� ��� ���
		}//if - ������ ȸ�� ����
	}// main
}//class
