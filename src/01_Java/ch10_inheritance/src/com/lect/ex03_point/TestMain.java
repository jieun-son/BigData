package com.lect.ex03_point;

public class TestMain {
	public static void main(String[] args) {
//		Point point = new Point();
//		point.setX(5); point.setY(10);
//		point.pointPrint();
//		System.out.println(point.pointInfoString());
		Point3D point3d = new Point3D();
		point3d.setX(5);
		point3d.setY(10);
		point3d.setZ(15);
		point3d.pointPrint(); // ������ �� ��� �޼ҵ��� ��ӿ��� ���ܽ�ų �� ����
		point3d.point3dPrint();
		System.out.println(point3d.point3dInfoString());
	}

}
