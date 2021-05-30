package com.lect.ex3_readerWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class Ex01_Reader {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("txtFile/inTest.txt"); // 1.���Ͽ���
			while(true) { // 2. �����͸� �д´�
				int i = reader.read(); 
				if(i==-1) break;
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(reader!=null) reader.close(); // 3.���� �ݴ´�
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
