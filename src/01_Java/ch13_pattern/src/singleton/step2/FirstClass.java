package singleton.step2;

public class FirstClass {
	public FirstClass() {
		SingletonClass singletonObject = SingletonClass.getInstance();
		System.out.println("FirstClass형 객체 생성");
		System.out.println("i값:"+singletonObject.getI());
		singletonObject.setI(999);
		System.out.println("변경후 i값:"+singletonObject.getI());
		System.out.println("FirstClass 생성자 끝");
	}
}
