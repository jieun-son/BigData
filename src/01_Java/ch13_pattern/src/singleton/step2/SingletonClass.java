package singleton.step2;

public class SingletonClass {
	private static SingletonClass INSTANCE;
	private int i;
	private SingletonClass() {i=10;}
	public static SingletonClass getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
	}
	public int getI() {return i;}
	public void setI(int i) {this.i = i;}
}
