package com.lect.ex4_quiz;
import java.util.ArrayList;
import java.util.Scanner;
public class TestMain1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer, name, phone, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		do {
			System.out.print("ȸ������ �����Ͻðڽ��ϱ�(Y/N)? ");
			answer = scanner.next();
			
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")){ // ȸ������ ����
				Customer customer = new Customer();
				System.out.print("�����Ͻ� ȸ���� �̸��� ?");
				customer.setName(scanner.next());
				System.out.print("�����Ͻ� ȸ���� ��ȭ��ȣ�� ?");
				customer.setPhone(scanner.next());
				System.out.print("�����Ͻ� ȸ���� �ּҴ� ?");
				scanner.nextLine(); // ��������� �뵵
				customer.setAddress(scanner.nextLine());
				customers.add(customer);
			}
		}while(true);
		scanner.close();
		if(customers.isEmpty()) {
			System.out.println("�� ������ ȸ���� �����ϴ� ��");
		}else {
			System.out.println("�� ������ ȸ�� ����Ʈ ��� ��");
			for(Customer customer : customers) {
				System.out.println(customer);
			}
		}
		
	}
}
