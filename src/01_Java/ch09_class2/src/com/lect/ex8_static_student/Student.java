package com.lect.ex8_static_student;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private static int count; 
	public Student() {}
	public Student(String name, int kor, int eng, int mat) {
		no = ++count;
		this.name = name; this.kor = kor;
		this.eng = eng;   this.mat = mat;
		tot = kor+eng+mat;
		avg = tot/3.0;
	}
	public void infoPrint() {
		System.out.printf("%d \t %s \t %d \t %d \t %d \t %d \t %.1f\n",
	             			no, name, kor,  eng,   mat,  tot,  avg);
	}
	public String infoString() {
		String result 
			= String.format("%d \t %s \t %d \t %d \t %d \t %d \t %.1f\n",
							no, name, kor,  eng,   mat,  tot,  avg);
		return result;
	}
	// setter & getter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
}
