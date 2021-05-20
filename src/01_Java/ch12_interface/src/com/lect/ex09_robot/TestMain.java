package com.lect.ex09_robot;
public class TestMain {
	public static void main(String[] args) {
		RobotOrder order = new RobotOrder();
		DanceRobot danceRobot = new DanceRobot();
		DrawRobot  drawRobot  = new DrawRobot();
		SingRobot  singRobot  = new SingRobot();
		Robot[] robots = {danceRobot, 
						  drawRobot, 
						  singRobot};
		for(Robot robot : robots) {
			order.action(robot);
		}
	}
}
