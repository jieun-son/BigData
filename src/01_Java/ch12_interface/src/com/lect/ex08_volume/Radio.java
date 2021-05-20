package com.lect.ex08_volume;
public class Radio implements IVolume {
	private int volumeLevel;
	public Radio() { }
	public Radio(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void volumeUp() { // volumeLevel�� 1����
		volumeLevel++;
		if(volumeLevel>=RADIO_MAX_VOLUME) {
			volumeLevel = RADIO_MAX_VOLUME;
			System.out.println("������ �ִ�ġ�Դϴ�. û���� �����մϴ�");
		}else {
			System.out.println("Radio ������ 1��ŭ �÷� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeUp(int level) { // volumeLevel�� level��ŭ ����
		volumeLevel += level;
		if(volumeLevel>=RADIO_MAX_VOLUME) {
			volumeLevel = RADIO_MAX_VOLUME;
			System.out.println("������ �ִ�ġ �Դϴ�. û���� �����մϴ�");
		}else {
			System.out.println("Radio ������ "+level+"��ŭ �÷� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeDown() { // ������ 1��ŭ ����
		volumeLevel --;
		if(volumeLevel<= MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("���� �����Դϴ�");
		}else {
			System.out.println("Radio ������ 1��ŭ ���� ���� ���� "+volumeLevel);
		}
	}
	@Override
	public void volumeDown(int level) { // ������ level��ŭ ����
		volumeLevel -= level;
		if(volumeLevel<=MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("���� �����Դϴ�");
		}else {
			System.out.println("Radio ������ "+level+"��ŭ ���� ���� ���� "+volumeLevel);
		}
	}
}






