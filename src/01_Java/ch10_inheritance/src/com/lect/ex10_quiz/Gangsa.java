package com.lect.ex10_quiz;

public class Gangsa extends Person{
	private String subject;
//	public Gangsa() { }
	public Gangsa(String id, String name, String subject){
		super(id,name);
		this.subject = subject;
	}
	@Override
	public String infoString() {
		return super.infoString()+"\t(????)"+subject;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("\t(????)"+subject);
	}
}
