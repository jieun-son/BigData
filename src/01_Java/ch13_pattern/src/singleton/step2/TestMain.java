package singleton.step2;
public class TestMain {
	public static void main(String[] args) {
		FirstClass firstObj = new FirstClass();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		SecondClass secondObj = new SecondClass();
		SingletonClass singObj = SingletonClass.getInstance();
		System.out.println("main�Լ����� singObj.i = "+singObj.getI());
	}
}
