package com.lect.ex2_data;
public class Product {
	private String name;
	private int    price;
	private int    ps;
	public Product() { }
	public Product(String name, int price, int ps) {
		this.name = name;
		this.price = price;
		this.ps = ps;
	}
	@Override
	public String toString() {
		return String.format("%s\t%d¿ø\t%d°³", name, price, ps);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
}
