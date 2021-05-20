package com.lect.ex10_quiz;

public class Staff extends Person{
	private String department;
	public Staff() { }
	public Staff(String id, String name, String department){
		super(id,name);
		this.department = department;
	}
	@Override
	public String infoString() {
		return super.infoString()+"\t(�μ�)"+department;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("\t(�μ�)"+department);
	}
}
