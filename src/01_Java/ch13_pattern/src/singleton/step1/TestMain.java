package singleton.step1;
public class TestMain {
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		if(obj1!=obj2) {
			System.out.println("두 객체의 주소는 달라");
		}
		obj1.setI(999);
		System.out.println("obj1.i = "+obj1.getI());
		System.out.println("obj2.i = "+obj2.getI());
	}
}
