package com.lect.ex3_set;
import java.util.HashSet;
public class Ex03_StudentHashSet {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();
		Student s = new Student(6, "이순신");
		students.add(s);
		students.add(s);
		System.out.println("students : " + students );
		students.add(new Student(3, "홍길동"));
		students.add(new Student(1, "장보고"));
		students.add(new Student(1, "장보고"));
		System.out.println("students : " + students );
	}
}
