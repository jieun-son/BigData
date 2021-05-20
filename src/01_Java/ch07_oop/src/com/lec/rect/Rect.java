package com.lec.rect;
public class Rect {
	private int width;
	private int height;
	public int area() {
		return width * height;
	}
	// setter
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// getter
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
}