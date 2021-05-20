package com.lect.ex08_volume;
public class TV implements IVolume {
	private int volumeLevel;
	public TV() { }
	public TV(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void volumeUp() { // volumeLevel�� 1����
		volumeLevel++;
		if(volumeLevel>=TV_MAX_VOLUME) {
			volumeLevel = TV_MAX_VOLUME;
			System.out.println("������ �ִ�ġ�Դϴ�. û���� �����մϴ�");
		}else {
			System.out.println("TV ������ 1��ŭ �÷� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeUp(int level) { // volumeLevel�� level��ŭ ����
		volumeLevel += level;
		if(volumeLevel>=TV_MAX_VOLUME) {
			volumeLevel = TV_MAX_VOLUME;
			System.out.println("������ �ִ�ġ �Դϴ�. û���� �����մϴ�");
		}else {
			System.out.println("TV ������ "+level+"��ŭ �÷� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeDown() { // ������ 1��ŭ ����
		volumeLevel --;
		if(volumeLevel<= MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("���� �����Դϴ�");
		}else {
			System.out.println("TV ������ 1��ŭ ���� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeDown(int level) { // ������ level��ŭ ����
		volumeLevel -= level;
		if(volumeLevel<=MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("���� �����Դϴ�");
		}else {
			System.out.println("TV ������ "+level+"��ŭ ���� ���� ���� "+volumeLevel);
		}
	}
}






