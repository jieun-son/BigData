package com.lec.ex;
public class Ex01 {
	public static void main(String[] args) {
//		int i = 10; // ������ ����� �ʱ�ȭ
		int[] iArr = {10,20,30,40,50}; // 1.�迭 ���� ����� �ʱ�ȭ
		iArr[0] = 90; // �迭�� index�� ���� (index:0~4)
		for(int idx=0 ; idx<iArr.length ; idx++) {//iArr.length : �迭ũ��
			System.out.println(iArr[idx]);
		}
		int[] iArr2 = new int[5]; // 2.�迭��������� �迭�޸� ����Ȯ��(�迭 ��ü ����)
		iArr2[0]=99;
		for(int idx=0 ; idx<iArr2.length ; idx++) { // �Ϲ�for���� �̿��� �迭 ����
			System.out.println("iArr2 �迭�� "+idx+"��°�� : "+iArr2[idx]);
		}
		int[] iArr3; // 3. �迭 ������ ����
		iArr3 = new int[3]; // 0 0 0
		for(int temp : iArr3) { // Ȯ��for���� �̿��� �迭 �����Ͽ� ���(sysout)
			System.out.println(temp);
		}
//		for(int temp : iArr3) { // Ȯ�� for���� �̿��� �迭 �� ���� �Ұ�
//			temp = 999;
//		}
		for(int idx=0 ; idx<iArr3.length ; idx++) { // �Ϲ�for���� �̿��� �� ����
			iArr3[idx] = 999;
		}
		for(int temp : iArr3) {
			System.out.println(temp);
		}
	}
}














