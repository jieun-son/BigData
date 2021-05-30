package com.lect.ex1_inputStreamOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
// (1)������ ����(��Ʈ����ü����) (2)�����͸� �д´� (3)������ �ݴ´�
public class Ex01_inputStream {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/inTest.txt");//1.������ ����
			// 2. �����͸� �д´�(���ϳ��϶����� 1byte�� �ݺ������� �д´�)
			while(true) {
				int i = is.read(); // 1byte�� �б�
				if(i==-1) break; // ������ ������ ����
				System.out.print((char)i + "("+i+")");
			}
			System.out.println("DONE");
		} catch (FileNotFoundException e) {
			System.out.println("���ܸ޼���:���ϸ�ã��"+e.getMessage());
		} catch (IOException e) {
			System.out.println("���ܸ޼��� : ������ "+e.getMessage());
		} finally {
			// 3. ������ �ݴ´�
			try {
				if(is!=null) is.close();
			} catch (IOException e) { }
		}
	}
}
