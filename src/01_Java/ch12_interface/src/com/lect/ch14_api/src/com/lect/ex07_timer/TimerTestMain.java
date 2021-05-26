package com.lect.ex07_timer;
import java.util.Timer;
import java.util.TimerTask;
public class TimerTestMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");
		Timer timer = new Timer(true);
		TimerTask ex1 = new TimerTaskEx1();
		TimerTask ex2 = new TimerTaskEx2();
		timer.schedule(ex1, 2000); // ex1작업을 2초후에 한번 실행
		timer.schedule(ex2, 500, 1000); //ex2작업을 0.5초후에 1초마다 실행
		Thread.sleep(10000); // 10초 대기
		System.out.println("끝");
	}
}
