package com.lec.ex;
// ����ȯ = �������� ����ȯ, ������� ����ȯ
public class VarEx06 {
	public static void main(String[] args) {
		int i1 = 10;
		double d1 = i1; // �������� ����ȯ(���� �ָӴ� �����͸� ū �ָӴϿ� �Ҵ�)
		System.out.printf("i1=%d, d1=%.2f\n", i1, d1);
		d1 = 10.9;
		i1 = (int)d1; // ������� ����ȯ(ū�ָӴ� �����͸� ���� �ָӴϿ� �Ҵ�)
		System.out.printf("i1=%d, d1=%.2f\n", i1, d1);
	}
}
