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
			dos.writeUTF("ȫ�浿"); // ��Ʈ���� ����
			dos.writeInt(2);      // int�� ����
			dos.writeDouble(95.9);// double�� ����
			
			dos.writeUTF("���浿"); // ��Ʈ���� ����
			dos.writeInt(3);      // int�� ����
			dos.writeDouble(99.9);// double�� ����
			
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO���� : "+e.getMessage());
		} finally {
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) { }
		}
	}
}







