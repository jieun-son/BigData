package strategy.step3;
public abstract class Robot {
	public void shape() {
		System.out.println(getClass().getName()+
				"�� ��, �ٸ�, �Ӹ�, �������� �̷���� �ִ�");
	}
	public void actionWalk() {
		System.out.println("���� �� �ִ�");
	}
	public void actionRun() {
		System.out.println("�� �� �ִ�.");
	}
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionKnife();
}
