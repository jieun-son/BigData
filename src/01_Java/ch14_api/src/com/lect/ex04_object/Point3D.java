package com.lect.ex04_object;
public class Point3D implements Cloneable{
	private int x;
	private int y;
	private int z;
	public Point3D() { }
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return String.format("[%d, %d, %d]", x, y, z);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Point3D) {
			boolean xChk = x == ((Point3D)obj).x;
			boolean yChk = y == ((Point3D)obj).y;
			boolean zChk = z == ((Point3D)obj).z;
			return xChk && yChk && zChk;
		}else {
			return false;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
