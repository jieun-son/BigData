package com.lect.ex4_quiz;
import java.util.ArrayList;
import java.util.Scanner;
public class TestMain1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer, name, phone, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		do {
			System.out.print("회원가입 진행하시겠습니까(Y/N)? ");
			answer = scanner.next();
			
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")){ // 회원가입 진행
				Customer customer = new Customer();
				System.out.print("가입하실 회원님 이름은 ?");
				customer.setName(scanner.next());
				System.out.print("가입하실 회원님 전화번호는 ?");
				customer.setPhone(scanner.next());
				System.out.print("가입하실 회원님 주소는 ?");
				scanner.nextLine(); // 버퍼지우는 용도
				customer.setAddress(scanner.nextLine());
				customers.add(customer);
			}
		}while(true);
		scanner.close();
		if(customers.isEmpty()) {
			System.out.println("☞ 가입한 회원이 없습니다 ☜");
		}else {
			System.out.println("☞ 가입한 회원 리스트 목록 ☜");
			for(Customer customer : customers) {
				System.out.println(customer);
			}
		}
		
	}
}
