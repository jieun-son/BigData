package com.lect.ex02;
//Super method1(�߻�) method2(�Ϲ�)
//Child method1(�Ϲ�) method2(�Ϲ�) method3(�Ϲ�)
public class TestMain {
	public static void main(String[] args) {
		//Super s = new Super(); �߻�Ŭ������ ��ü ���� �Ұ� 
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		Super c2 = new Child();
		c2.method1();
		c2.method2();
		((Child)c2).method3();
	}
}
