package com.lect.ex3_readerWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
// 1. 키보드로부터 출력할 파일이름을 입력받습니다. (a.txt -> txtFile/a.txt)
// 2. 출력하고자 하는 내용을 라인단위로 반복적으로 받습니다(단, 저장을 끝내고 싶으면 x)
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String filename;
		Writer writer = null;
		String outMsg;
		System.out.print("저장하고자 하는 파일이름은 ?");
		filename = scanner.next();
		scanner.nextLine(); // 버퍼 지우는 용도
		try {
			writer = new FileWriter("txtFile/"+filename, true);
			while(true) {
				System.out.print("파일로 출력할 메세지는(단, 종료는 x) ?");
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














