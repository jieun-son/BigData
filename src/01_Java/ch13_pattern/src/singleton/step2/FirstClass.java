package singleton.step2;

public class FirstClass {
	public FirstClass() {
		SingletonClass singletonObject = SingletonClass.getInstance();
		System.out.println("FirstClass�� ��ü ����");
		System.out.println("i��:"+singletonObject.getI());
		singletonObject.setI(999);
		System.out.println("������ i��:"+singletonObject.getI());
		System.out.println("FirstClass ������ ��");
	}
}
