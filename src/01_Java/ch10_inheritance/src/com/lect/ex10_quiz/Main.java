package com.lect.ex10_quiz;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("A01","나학생","JAVA반");
		Student st2 = new Student("A02","홍길동","C++반");
		Staff sf1 = new Staff("S01","나직원","교무팀");
		Staff sf2 = new Staff("S02","나도요","취업지원팀");
		Gangsa ga1 = new Gangsa("G01","나선생","프로그래밍");
		Person[] person = {st1, st2, sf1, sf2, ga1};
		for(Person p : person) {
			p.print();
//			System.out.println(p.infoString());
		}
	}
}
