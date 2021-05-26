package strategy.step3;

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
	}
}
