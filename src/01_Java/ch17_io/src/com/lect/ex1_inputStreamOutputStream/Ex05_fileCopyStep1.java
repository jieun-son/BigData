package com.lect.ex1_inputStreamOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Ex05_fileCopyStep1 {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:/bigdata/bts.jpg");
			os = new FileOutputStream("C:/bigdata/bts_copyed.jpg");
			int cnt = 0;
			while(true) {
				cnt++;
				int i = is.read();
				if(i == -1) break;
				os.write(i);
			}
			System.out.println(cnt+"번 while문 실행하며 힘들게 복사 성공");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(os!=null) os.close();
				if(is!=null) is.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}// try-catch
		}//finally
	}//main
}//class
