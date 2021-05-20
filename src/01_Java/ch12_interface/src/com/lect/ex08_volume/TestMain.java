package com.lect.ex08_volume;
public class TestMain {
	public static void main(String[] args) {
		Radio   radio   = new Radio();
		TV      tv      = new TV(5);
		Speaker speaker = new Speaker(20);
		radio.volumeDown();
		tv.volumeUp(20);
		IVolume[] device = {radio, tv, speaker};
		for(IVolume d : device) { // 확장for문
			d.volumeUp(10);
		}
		for(int idx=0 ; idx<device.length ; idx++) { // 일반for문
			device[idx].volumeDown(5);
		}
		device[0].mute();
	}
}
