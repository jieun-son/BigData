package singleton.step2;

public class SecondClass {
	public SecondClass() {
		SingletonClass singletonObject = SingletonClass.getInstance();
		System.out.println("SecondClass 积己磊 救俊辑");
		System.out.println(singletonObject.getI());
		System.out.println("SecondClass 积己磊 场");
	}
}
