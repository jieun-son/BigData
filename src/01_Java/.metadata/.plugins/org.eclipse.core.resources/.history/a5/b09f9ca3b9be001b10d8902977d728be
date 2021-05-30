package com.lect.ex1_inputStreamOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Ex04_outputStream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {                                // true :파일에 append
			os = new FileOutputStream("txtFile/outTest.txt", true); // 1단계
			String str = "\n한글 \n 이 시국에 모두 건강하시길";
			byte[] bs = str.getBytes(); // 스트링을 byte배열로 바꾸는 함수
			os.write(bs); // 2단계
			System.out.println("파일 출력 성공");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(os!=null) os.close(); // 3단계
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
