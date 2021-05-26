package strategy.step4.modul;

import strategy.step4.component.*;

public class SuperRobot extends Robot{
	
	public SuperRobot() {
		setFly(new FlyYes());
		setMissile(new MissileYes());
		setKnife(new KnifeLazer());
	}
	

}
