package com.lect.ex1_inputStreamOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// (1)파일을 연다(스트림객체생성) (2)데이터를 읽는다 (3)파일을 닫는다
public class Ex01_inputStream {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/inTest.txt");//1.파일을 연다
			// 2. 데이터를 읽는다(파일끝일때까지 1byte씩 반복적으로 읽는다)
			while(true) {
				int i = is.read(); // 1byte씩 읽기
				if(i==-1) break; // 파일이 끝인지 여부
				System.out.print((char)i + "("+i+")");
			}
			System.out.println("DONE");
		} catch (FileNotFoundException e) {
			System.out.println("예외메세지:파일못찾음"+e.getMessage());
		} catch (IOException e) {
			System.out.println("예외메세지 : 못읽음 "+e.getMessage());
		} finally {
			// 3. 파일을 닫는다
			try {
				if(is!=null) is.close();
			} catch (IOException e) { }
		}
	}
}
