package com.lect.ex6_quiz;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class MainTestPrintWrtier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String join, name, phone, birth, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String today = sdf.format(now); // "05-28"
		do {
			System.out.print("회원가입 하실래요(Y/N)? ");
			join = scanner.next();
			if(join.equalsIgnoreCase("n")) break;
			System.out.print("회원이름 ? ");
			name = scanner.next();
			System.out.print("전화번호 ? ");
			phone = scanner.next();
			System.out.print("생일(mm-dd) ? ");
			birth = scanner.next();
			System.out.print("주소 ? ");
			scanner.nextLine();
			address = scanner.nextLine();
			if(birth.equals(today)) {
				System.out.println(name+"님 생일이시군요. 생일축하합니다");
			}
			customers.add(new Customer(name, phone, birth, address));
		}while(true);
		scanner.close();
		// 2. ArrayList 정보와 몇명 가입했는지 파일 출력과 콘솔 출력한다
		Writer writer = null;
		try {
			writer = new FileWriter("txtFile/customer.txt",true);
			for(Customer c:customers) {
				System.out.print(c);
				writer.write(c.toString());
			}
			String msg = String.format("\t\t\t...이하 %d명 가입\n\n", customers.size());
			System.out.println(msg);
			writer.write(msg);
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음"+e.getMessage());
		} catch (IOException e) {
			System.out.println("쓰기 예외"+e.getMessage());
		}finally {
			try {
				if(writer!=null) writer.close();
			} catch (Exception ignore) { 
				System.out.println(ignore.getMessage());
			}
		}//try-catch-finally
	}//main
}
