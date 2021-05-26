package strategy.step4.modul;

import strategy.step4.component.FlyHigh;

public class TestMain {
	public static void main(String[] args) {
		Robot[] robots = {new SuperRobot(), 
				new LowRobot()};
		for(Robot robot : robots) {
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMissile();
			robot.actionKnife();
		}
		robots[0].setFly(new FlyHigh()); // 기능 업그레이드
		for(Robot robot : robots) {
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMissile();
			robot.actionKnife();
		}
	}
}
