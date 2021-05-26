package com.lect.ex07_timer;
import java.util.TimerTask;
public class TimerTaskEx2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("작업 2 : 1초에 한번씩 수행될 예정인 TimerTask ♨♨♨");
	}
}
