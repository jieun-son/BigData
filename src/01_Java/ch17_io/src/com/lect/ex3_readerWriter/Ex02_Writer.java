package com.lect.ex3_readerWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Ex02_Writer {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("txtFile/outTest.txt", true); // 1.������ ����
//			char[] msg = {'��','��','��','��','��'};
//			for(char m : msg) {
//				writer.write(m);
//			}
			String str = "�ȳ��ϼ���\n�ڹ�\n����� �ų��� �ݿ���";
			String str1 = "\n�Ϳ�";
			writer.write(str);
			writer.write(str1);
			System.out.println("���� ����");
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
