package com.lec.ex;

public class VarEx02 {
	public static void main(String[] args) {
		int i = 10 ; // 4byte¥�� i�ָӴϿ� 10�� �ִ´�.
		byte j = 20; // 1byte¥�� j�ָӴϿ� 20�� �Ҵ��Ѵ�.
		double d = 1; // 8byte¥�� �Ǽ� d�ָӴϿ� 0.1�� �Ҵ��Ѵ�.
		char c = 'C'; // 2byte¥�� ���� c�ָӴϿ� '��'�� �Ҵ�
		boolean ok = true;
		long l = 2200000000L;
		System.out.println("i\t j\t d"); //\t��  println ��������
		System.out.println(i+"\t"+j+"\t"+d);
		System.out.print("���� c�� ���� �ڵ�\n");  // print�� ���� ������
		System.out.printf("c=%c, c�� �ڵ尪=%d\n", c, (int)c);
		System.out.printf("ok=%b\n", ok);
		System.out.printf("l=%d\n", l);
		System.out.printf("d=%5.2f",d);
		// %d(����) %f(�Ǽ�) %b(�Ҹ�) %x(16����) %c(����) %s(���ڿ�)
	}
}
