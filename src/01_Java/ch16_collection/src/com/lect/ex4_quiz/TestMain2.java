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
			System.out.print("회원가입 진행하시겠습니까(Y/N)? ");
			answer = scanner.next();
			if(answer.equalsIgnoreCase("n")) {
				break;
			}else if(answer.equalsIgnoreCase("y")){ // 회원가입 진행
				System.out.print("가입하실 회원님 이름은 ?");
				name = scanner.next();
				System.out.print("가입하실 회원님 전화번호는 ?");
				phone = scanner.next();
				Iterator<String> iterator = customers.keySet().iterator();
				boolean phoneChk = false;
				while(iterator.hasNext()) {
					String key = iterator.next();
					if(customers.get(key).getPhone().equals(phone)) {
						phoneChk = true;
						break;
					}
				}//while - 회원 목록에 해당 전화번호가 있는지?
				if(phoneChk) {
					System.out.println("이미 가입되어 있는 전화번호입니다. 전화번호는 중복될 수 없습니다");
					continue;
				}
				System.out.print("가입하실 회원님 주소는 ?");
				scanner.nextLine(); // 버퍼지우는 용도
				address = scanner.nextLine();
//				Customer temp = new Customer(name, phone, address);
//				customers.put(phone, temp);
				customers.put(phone, new Customer(name, phone, address));
			}
		}while(true);
		scanner.close();
		if(customers.isEmpty()) {
			System.out.println("☞ 가입한 회원이 없습니다 ☜");
		}else {
			System.out.println("☞ 가입한 회원 리스트 목록 ☜");
			Iterator<String> iterator = customers.keySet().iterator();
			while(iterator.hasNext()) {
				System.out.println(customers.get(iterator.next()));
			}//while - 회원 목록 출력
		}//if - 가입한 회원 유무
	}// main
}//class
