package com.lect.ex2_data;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
public class Ex04_productInput {
	public static void main(String[] args) {
		InputStream     fis = null;
		DataInputStream dis = null;
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			fis = new FileInputStream("src/com/lect/ex2_data/product.dat");
			dis = new DataInputStream(fis);
			while(true) {
				String name = dis.readUTF(); // 물건명
				int    price = dis.readInt();//가격
				int    ps    = dis.readInt(); //재고량
				products.add(new Product(name, price, ps));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("재고 데이터는 다음과 같습니다");
		} finally {
			try {
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (Exception e2) { }
		}//try-catch-finally
		if(products.isEmpty()) {
			System.out.println("재고 상품이 없습니다.");
		}else {
			System.out.println("물건명\t가격\t재고갯수");
			for(Product product : products) {
				System.out.println(product);
			}
			System.out.println("이상 "+products.size()+"개 재고 상품 입력됨");
		}//if
	}
}








