package com.lect.ex6_quiz;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class MainTestWriter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String join, name, phone, birth, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String today = sdf.format(now); // "05-28"
		do {
			System.out.print("ȸ������ �ϽǷ���(Y/N)? ");
			join = scanner.next();
			if(join.equalsIgnoreCase("n")) break;
			System.out.print("ȸ���̸� ? ");
			name = scanner.next();
			System.out.print("��ȭ��ȣ ? ");
			phone = scanner.next();
			System.out.print("����(mm-dd) ? ");
			birth = scanner.next();
			System.out.print("�ּ� ? ");
			scanner.nextLine(); // ���������
			address = scanner.nextLine();
			if(birth.equals(today)) {
				System.out.println(name+"�� �����̽ñ���. ���������մϴ�");
			}
			customers.add(new Customer(name, phone, birth, address));
		}while(true);
		scanner.close();
		// 2. ArrayList ������ ��� �����ߴ��� ���� ��°� �ܼ� ����Ѵ�
		Writer writer = null;
		PrintWriter printWriter = null;
		try {
			writer = new FileWriter("txtFile/customer.txt",true);
			printWriter = new PrintWriter(writer);
			for(Customer c:customers) {
				System.out.print(c);
				printWriter.print(c.toString());
			}
			System.out.printf("\t\t\t...���� %d�� ����\n\n", customers.size());
			printWriter.printf("\t\t\t...���� %d�� ����\n\n", customers.size());
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã��"+e.getMessage());
		} catch (IOException e) {
			System.out.println("���� ����"+e.getMessage());
		}finally {
			try {
				if(printWriter!=null) printWriter.close();
				if(writer!=null) writer.close();
			} catch (Exception ignore) { 
				System.out.println(ignore.getMessage());
			}
		}//try-catch-finally
	}//main
}
