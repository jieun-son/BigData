package com.lect.ex3_man;
// Man kim = new Man(30, 170, 60, "010-9999-9999");
// Man kang = new Man(170, 60, "010-9999-9999");
// Man yi = new Man(170, 60);
public class Man {
	private int age;
	private int height;
	private int weight;
	private String phoneNum;
	public Man() {} // ����Ʈ ������
	public Man(int height, int weight) {
		this.height = height;  this.weight = weight;
	}
	public Man(int height, int weight, String phoneNum) {
		this.height = height; this.weight = weight; this.phoneNum = phoneNum;
	}
	public Man(int age, int height, int weight, String phoneNum) {
		this.age = age; this.height = height; this.weight = weight; this.phoneNum = phoneNum;
	}
	public double calculateBMI() {
		double result = weight / ( (height*0.01) * (height*0.01) );
		return result;
	}
	public void setAge(int age) { this.age = age; }
	public void setHeight(int height) { this.height = height; }
	public void setWeight(int weight) { this.weight = weight; }
	public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }
	public int getAge() { return age;	}
	public int getHeight() { return height;	}
	public int getWeight() { return weight;	}
	public String getPhoneNum() { return phoneNum; }
}












