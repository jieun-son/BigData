package com.lect.ex1_inputStreamOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// 1.파일연다 2.데이터쓴다 3.파일을닫는다
public class Ex03_outputStream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("txtFile/outTest.txt");//(1)
			byte[] bs = {'H','e','l','l','o'};
			for(int i=0 ; i<bs.length ; i++) { // (2)
				os.write(bs[i]);
			}
			os.write(bs);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os!=null) os.close(); // (3)
			} catch (IOException e) { }
		}
	}
}
