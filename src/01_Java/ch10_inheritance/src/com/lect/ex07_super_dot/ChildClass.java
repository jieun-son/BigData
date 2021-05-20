package com.lect.ex07_super_dot;
// super. 부모클래스의
public class ChildClass extends ParentClass {
	private String cStr = "자식클래스";
	public ChildClass() {
		System.out.println("자식 생성자");
	}
	@Override
	public void getMamiName() {
		System.out.print("이쁜 아주 이쁜");
		super.getMamiName();
	}
}
