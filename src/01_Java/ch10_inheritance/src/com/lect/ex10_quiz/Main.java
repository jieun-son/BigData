package com.lect.ex10_quiz;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("A01","���л�","JAVA��");
		Student st2 = new Student("A02","ȫ�浿","C++��");
		Staff sf1 = new Staff("S01","������","������");
		Staff sf2 = new Staff("S02","������","���������");
		Gangsa ga1 = new Gangsa("G01","������","���α׷���");
		Person[] person = {st1, st2, sf1, sf2, ga1};
		for(Person p : person) {
			p.print();
//			System.out.println(p.infoString());
		}
	}
}