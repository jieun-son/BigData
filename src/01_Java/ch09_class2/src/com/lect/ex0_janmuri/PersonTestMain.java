package com.lect.ex0_janmuri;
class Person{
	private String name;
	private int age;
	private char gender; // 'm' 'f'
	public Person() {} 
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age  = age;
		this.gender = gender;
	}
	public String infoString() {
		String result = "�̸� : "+name+", ���� : "+age+", ���� : "+gender;
		return result;
	}
	public void infoPrint() {
		System.out.printf("�̸� : %s, ���� : %d, ���� : %c\n", name, age, gender);
	}
	public void setName(String name)   { this.name = name; }
	public void setAge(int age)        {this.age = age;}
	public void setGender(char gender) { this.gender = gender;}
}
public class PersonTestMain {
	public static void main(String[] args) {
		Person[] person = {new Person("ȫ�浿", 20, 'm'),
				           new Person("ȫ���", 22, 'f'),
				           new Person()
		};
		person[2].setName("ȫȫȫ"); person[2].setAge(25); person[2].setGender('m');
		for(int idx = 0 ; idx<person.length ; idx++) { // �Ϲ� for��
			// person[idx].infoPrint();
			System.out.println(person[idx].infoString());
		}
		for(Person p : person) { // Ȯ�� for��
			// p.infoPrint();
			System.out.println(p.infoString());
		}
	}
}











