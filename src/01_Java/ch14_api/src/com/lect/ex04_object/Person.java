package com.lect.ex04_object;
public class Person {
	private long juminNo; // 9201011025856
	public Person(long juminNo) {
		this.juminNo = juminNo;
	}
	@Override
	public boolean equals(Object obj) {
		//p1.equals(p2)호출할 경우 p1대신 this, p2대신 obj => juminNo와 obj의 juminNo 같은지 여부를 return
		if(obj!=null && obj instanceof Person) {
			return juminNo == ((Person)obj).juminNo;
		}else {
			return false;
		}
	}
}














