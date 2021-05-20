package com.lect.ex5_boxorrect;
// 데이터(private), 생성자함수, 메소드, setter&getter
public class BoxOrRect {
	private int width;
	private int height;
	private int depth; 
	private int volume; // 부피나 넓이
	
	public BoxOrRect() { }
	public BoxOrRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public BoxOrRect(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void calV() {
		if(depth!=0) {
			volume = width * height * depth; // 직육면체
		}else {
			volume = width * height; // 직사각형
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}














