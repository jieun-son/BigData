package com.lect.ex06_wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		int sum = i+j;
		System.out.println(i==j? "����":"�ٸ���");
		Integer iObj = new Integer(10);
		Integer jObj = 10;
		sum = iObj.intValue() + jObj.intValue();
		sum = iObj + jObj;
		System.out.println(sum);
		System.out.println(iObj.equals(jObj) ? "����":"�ٸ���");
		System.out.println(iObj==jObj ? "�ּҰ� ����":"�ּҰ� �ٸ���");
	}
}
