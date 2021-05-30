package com.lect.ex1_awt;
import java.awt.*;
public class Ex03_login extends Frame{
	private Label lbl1;
	private TextField txtId;
	private Label lbl2;
	private TextField txtPw;
	private Button btnLogin;
	public Ex03_login(String title) {
		super(title);
		setLayout(new FlowLayout()); // 프레임의 레이아웃 셋팅
		lbl1 = new Label("아 이 디");
		txtId = new TextField(20);
		lbl2 = new Label("비밀번호");
		txtPw = new TextField(20);
		txtPw.setEchoChar('*'); // 비밀번호 입력시 *이 대신 보임
		btnLogin = new Button("LOGIN");
		add(lbl1);
		add(txtId);
		add(lbl2);
		add(txtPw);
		add(btnLogin);
		setSize(new Dimension(300, 150));
		setLocation(100, 100);
		setVisible(true);
		setResizable(false);// 사용자가 frame 사이즈 조정 불가
	}
	public static void main(String[] args) {
		new Ex03_login("로그인");
	}
}











