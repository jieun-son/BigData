package com.lect.ex04_object;
public class Person {
	private long juminNo; // 9201011025856
	public Person(long juminNo) {
		this.juminNo = juminNo;
	}
	@Override
	public boolean equals(Object obj) {
		//p1.equals(p2)ȣ���� ��� p1��� this, p2��� obj => juminNo�� obj�� juminNo ������ ���θ� return
		if(obj!=null && obj instanceof Person) {
			return juminNo == ((Person)obj).juminNo;
		}else {
			return false;
		}
	}
}














