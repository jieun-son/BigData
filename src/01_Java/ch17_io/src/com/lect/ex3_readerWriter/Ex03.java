package com.lect.ex3_readerWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
// 1. Ű����κ��� ����� �����̸��� �Է¹޽��ϴ�. (a.txt -> txtFile/a.txt)
// 2. ����ϰ��� �ϴ� ������ ���δ����� �ݺ������� �޽��ϴ�(��, ������ ������ ������ x)
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filename;
		Writer writer = null;
		String outMsg;
		System.out.print("�����ϰ��� �ϴ� �����̸��� ?");
		filename = scanner.next();
		scanner.nextLine(); // ���� ����� �뵵
		try {
			writer = new FileWriter("txtFile/"+filename, true);
			while(true) {
				System.out.print("���Ϸ� ����� �޼�����(��, ����� x) ?");
				outMsg = scanner.nextLine();
				if(outMsg.equalsIgnoreCase("x")) {
					break;
				}
				writer.write(outMsg+"\r\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(writer!=null) writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}














