package com.lect.ex2_data;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Ex01_dataOutputStream {
	public static void main(String[] args) {
		OutputStream     fos = null;
		DataOutputStream dos = null; 
		try {
			fos = new FileOutputStream("txtFile/dataFile.dat",true);
			dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동"); // 스트링값 저장
			dos.writeInt(2);      // int값 저장
			dos.writeDouble(95.9);// double값 저장
			
			dos.writeUTF("마길동"); // 스트링값 저장
			dos.writeInt(3);      // int값 저장
			dos.writeDouble(99.9);// double값 저장
			
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO예외 : "+e.getMessage());
		} finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) { }
		}
	}
}







