package com.lect.ex08_volume;
public class Radio implements IVolume {
	private int volumeLevel;
	public Radio() { }
	public Radio(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void volumeUp() { // volumeLevel을 1증가
		volumeLevel++;
		if(volumeLevel>=RADIO_MAX_VOLUME) {
			volumeLevel = RADIO_MAX_VOLUME;
			System.out.println("볼륨이 최대치입니다. 청력이 위험합니다");
		}else {
			System.out.println("Radio 볼륨을 1만큼 올려 현재 볼륨 "+volumeLevel);
		}
	}
	@Override
	public void volumeUp(int level) { // volumeLevel을 level만큼 증가
		volumeLevel += level;
		if(volumeLevel>=RADIO_MAX_VOLUME) {
			volumeLevel = RADIO_MAX_VOLUME;
			System.out.println("볼륨이 최대치 입니다. 청력이 위험합니다");
		}else {
			System.out.println("Radio 볼륨을 "+level+"만큼 올려 현재 볼륨 "+volumeLevel);
		}
	}
	@Override
	public void volumeDown() { // 볼륨을 1만큼 내림
		volumeLevel --;
		if(volumeLevel<= MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("현재 무음입니다");
		}else {
			System.out.println("Radio 볼륨을 1만큼 내려 현재 볼륨 "+volumeLevel);
		}
	}
	@Override
	public void volumeDown(int level) { // 볼륨을 level만큼 내림
		volumeLevel -= level;
		if(volumeLevel<=MIN_VOLUME) {
			volumeLevel = MIN_VOLUME;
			System.out.println("현재 무음입니다");
		}else {
			System.out.println("Radio 볼륨을 "+level+"만큼 내려 현재 볼륨 "+volumeLevel);
		}
	}
}






