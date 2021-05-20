package com.lect.ex09_robot;
public class RobotOrder {
	public void action(Robot robot) {
		// 로봇에게 dance()를 시키거나 sing()을 시키거나 draw()를 시키는 로직
		if(robot instanceof DanceRobot) {//robot 변수의 객체 타입
			DanceRobot tempRobot = (DanceRobot) robot;
			tempRobot.dance();
		}else if(robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}else if(robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		}
	}
}
