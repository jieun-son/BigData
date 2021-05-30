package com.lect.ex1_inputStreamOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// 1. 파일은 연다 2.읽는다  3. 파일을 닫는다   
public class Ex02_inputStreamByteArray {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/inTest.txt");//(1)
			byte[] bs = new byte[20];
			while(true) {
				//(2)
				int readByteCount = is.read(bs, 0, 10);
				if(readByteCount == -1) break;
				for(byte b : bs) {
					System.out.print((char)b);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일못찾음 : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IO예외 : "+e.getMessage());
		} finally {
			try {
				if(is!=null) is.close(); // (3)
			} catch (Exception e) { }
		}
	}
}
