package com.lect.ex03_point;
// Point3D p3 = new Point3D();
// p3.pointPrint(); 사용 안함
// sysout(p3.pointInfoString()); 사용안함
public class Point3D extends Point {
	private int z;
	public void point3dPrint() {
		System.out.printf("3차원 좌표 : %d, %d, %d\n", getX(), getY(), z);
	}
	public String point3dInfoString() {
		//return String.format("3차원 좌표 : %d, %d, %d\n", getX(), getY(), z);
		return "3차원 좌표 :" + getX() + ", "+getY()+","+z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
