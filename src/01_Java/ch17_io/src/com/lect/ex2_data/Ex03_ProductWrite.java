package com.lect.ex2_data;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class Ex03_ProductWrite {
	public static void main(String[] args) {
		// n을 입력할 때까지 재고(상품명, 가격, 재고량)을 파일로 출력
		Scanner scanner = new Scanner(System.in);
		String answer;
		OutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("src/com/lect/ex2_data/product.dat",true);
			dos = new DataOutputStream(fos);
			while(true) {
				System.out.print("입력할 재고가 더 있나요(Y/N)?");
				answer = scanner.next();
				if(answer.equalsIgnoreCase("n")) {
					break;
				}else if(answer.equalsIgnoreCase("y")) {
					System.out.print("입력할 재고 상품명 ? ");
					dos.writeUTF(scanner.next());
					System.out.print("입력한 상품의 가격은 ?");
					dos.writeInt(scanner.nextInt());
					System.out.print("입력한 상품의 재고량은 ?");
					dos.writeInt(scanner.nextInt());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}









