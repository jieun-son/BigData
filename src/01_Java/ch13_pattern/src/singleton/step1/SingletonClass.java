package singleton.step1;
public class SingletonClass {
	private int i;
	private static SingletonClass INSTANCE;
	public static SingletonClass getInstance() {
		// 积己等 按眉啊 绝栏搁 按眉甫 积己窍咯 林家甫 return
		// 积己等 按眉啊 乐阑 版快 弊 按眉狼 林家甫 return
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
