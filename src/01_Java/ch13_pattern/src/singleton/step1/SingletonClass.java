package singleton.step1;
public class SingletonClass {
	private int i;
	private static SingletonClass INSTANCE;
	public static SingletonClass getInstance() {
		// ������ ��ü�� ������ ��ü�� �����Ͽ� �ּҸ� return
		// ������ ��ü�� ���� ��� �� ��ü�� �ּҸ� return
		if(INSTANCE == null) {
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
	}
	private SingletonClass() {}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
