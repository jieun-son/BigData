package com.lect.ex04_object;
public class Rectangle implements Cloneable {
	private int width;
	private int height;
	private String color;
	public Rectangle() {
		color = "검정";
	}
	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	@Override
	public String toString() {
		return String.format("가로 %dcm, 세로 %dcm의 %s색 사각형", width, height, color);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Rectangle) {
			boolean widthChk  = width == ((Rectangle)obj).width;
			boolean heightChk = height == ((Rectangle)obj).height;
			boolean colorChk  = color.equals( ((Rectangle)obj).color);
			return widthChk && heightChk && colorChk;
		}else {
			return false;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColor(String color) {
		this.color = color;
	}
}














