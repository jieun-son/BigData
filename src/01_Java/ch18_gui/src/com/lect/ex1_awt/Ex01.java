package com.lect.ex1_awt;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
public class Ex01 extends Frame{
	private Button btn1;
	private Button btn2;
	public Ex01() {
		btn1 = new Button("버튼");
		btn2 = new Button("그냥 버튼");
		// Frame의 레이아웃 타입 : BorderLayout(동,서,남,북,중), 
		 //                   FlowLayout(좌부터우로 위부터 아래로)
		 //                   GridLayout(몇행 몇열)
		add(btn1, BorderLayout.CENTER); // BorderLayout일 경우 동,서,남,북,중 지정
		add(btn2, BorderLayout.SOUTH); 
		setVisible(true); 
		setSize(new Dimension(300, 200));
		//pack(); // 최소한의 사이즈로 
		setLocation(200,100);
		// 3초 후 자동 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		// 종료
		setVisible(false);
		dispose(); // 프레임 컴포넌트의 자원해제
		System.exit(0);
	}
	public Ex01(String title) {
		this();
		setTitle(title);
	}
}






