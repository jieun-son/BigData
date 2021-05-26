package com.lect.ex06_wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		int sum = i+j;
		System.out.println(i==j? "같다":"다르다");
		Integer iObj = new Integer(10);
		Integer jObj = 10;
		sum = iObj.intValue() + jObj.intValue();
		sum = iObj + jObj;
		System.out.println(sum);
		System.out.println(iObj.equals(jObj) ? "같다":"다르다");
		System.out.println(iObj==jObj ? "주소가 같다":"주소가 다르다");
	}
}
