package com.lect.ex07_employee;
public class SalaryEmployee extends Employee {
	private int annalSalary;
	public SalaryEmployee(String name, int annalSalary) {
		super(name);
		this.annalSalary = annalSalary;
	}
	@Override
	public int computePay() {
		return annalSalary / 14;
	}
}
