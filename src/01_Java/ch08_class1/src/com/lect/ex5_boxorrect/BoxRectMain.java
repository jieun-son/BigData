package com.lect.ex5_boxorrect;

public class BoxRectMain {
	public static void main(String[] args) {
		BoxOrRect box = new BoxOrRect(5, 6, 10);
		BoxOrRect rect = new BoxOrRect(5, 10);
		box.calV();
		rect.calV();
		System.out.println("box의 부피 : "+box.getVolume());
		System.out.println("rect의 부피 : "+rect.getVolume());
	}
}
