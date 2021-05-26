package com.lect.ex04_object;

public class Ex01_personTestMain {
	public static void main(String[] args) {
		Person p1 = new Person(9201011000006L);
		Person p2 = new Person(9201011000006L);
		Person p3=null;
		if(p1.equals(p3)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
		if(p1.equals(p2)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
		if(p1==p2) {
			System.out.println("p1과 p2는 같은 주소");
		}else {
			System.out.println("p1과 p2는 다른 주소");
		}
	}
}
