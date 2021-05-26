package com.lect.ex04_object;
public class Ex04_point3dTestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D(10, 20, 30);
		Point3D p3 = (Point3D)p2.clone();
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		System.out.println("p3="+p3);
		System.out.println(p2==p3 ? "같은 주소":"다른 주소");
		System.out.println(p2.equals(p3)? "같은 좌표값":"다른 좌표값");
	}
}
