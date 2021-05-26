package strategy.step4.modul;

import strategy.step4.component.*;

public class LowRobot extends Robot{
	public LowRobot() {
		setFly(new FlyNo());
		setMissile(new MissileNo());
		setKnife(new KnifeNo());
	}

}
