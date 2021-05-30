package com.lect.ex5_printWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
public class Ex01 {
	public static void main(String[] args) {
		OutputStream os         = null;
		Writer      writer      = null;
		PrintWriter printWriter = null;
		try {
//			os = new FileOutputStream("txtFile/outTest.txt", true);
//			printWriter = new PrintWriter(os);
//			writer = new FileWriter("txtFile/outTest.txt", true);
//			printWriter = new PrintWriter(writer);
			
			printWriter = new PrintWriter("txtFile/outTest.txt"); // 파일 append불가
			
			System.out.println("안녕하세요\n반갑습니다");
			printWriter.println("안녕하세요\r\n반갑습니다");
			
			System.out.print("print는 자동개행 안되서 개행 추가\n");
			printWriter.print("print는 자동개행 안되서 개행 추가\r\n");
			
			System.out.printf("%5s %3d %3d %5.1f\n", "홍길동",100,99, 99.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "홍길동",100,99, 99.5);
			System.out.printf("%5s %3d %3d %5.1f\n", "제갈공명",90,99, 94.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "제갈공명",90,99, 94.5);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(printWriter!=null) printWriter.close();
				if(os!=null) os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
