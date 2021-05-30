package com.lect.ex1_inputStreamOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Ex05_fileCopyStep3 {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			File file = new File("C:/bigdata/bts.jpg");
			is = new FileInputStream("C:/bigdata/bts.jpg");
			os = new FileOutputStream("C:/bigdata/bts_copyed.jpg");
			int cnt = 0;
			byte[] bs = new byte[(int)file.length()];
			while(true) {
				cnt++;
				//int i = is.read();
				int readByteCount = is.read(bs);
				if(readByteCount == -1) break;
				os.write(bs, 0, readByteCount);
			}
			System.out.println(cnt+"�� while�� �����ϸ� ����� ���� ����");
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
