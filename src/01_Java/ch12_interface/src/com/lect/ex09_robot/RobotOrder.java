package com.lect.ex09_robot;
public class RobotOrder {
	public void action(Robot robot) {
		// �κ����� dance()�� ��Ű�ų� sing()�� ��Ű�ų� draw()�� ��Ű�� ����
		if(robot instanceof DanceRobot) {//robot ������ ��ü Ÿ��
			DanceRobot tempRobot = (DanceRobot) robot;
			tempRobot.dance();
		}else if(robot instanceof DrawRobot) {
			((DrawRobot) robot).draw();
		}else if(robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		}
	}
}
