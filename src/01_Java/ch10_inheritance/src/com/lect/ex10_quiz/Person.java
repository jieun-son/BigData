package com.lect.ex10_quiz;
public class Person {
	private String id;
	private String name;
	public Person() { }
	public Person(String id, String name){
		this.id = id;
		this.name = name;
	}
	public void print(){
		System.out.print("(ID)"+id+"\t(?̸?):"+name);
	}
	public String infoString() {
		return "(ID)"+id+"\t(?̸?):"+name;
	}
	public String getId() { return id; }
	public String getName() {return name;}
}
