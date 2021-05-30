package com.lect.ex4_bufferedreader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class Ex {
	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader("txtFile/inTest.txt");
			br     = new BufferedReader(reader);
			while(true) {
				String line = br.readLine();
				if(line == null) break; // 파일의 끝
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br    !=null) br.close();
				if(reader!=null) reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
