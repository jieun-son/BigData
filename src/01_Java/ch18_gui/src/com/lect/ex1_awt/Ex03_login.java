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
		setLayout(new FlowLayout()); // �������� ���̾ƿ� ����
		lbl1 = new Label("�� �� ��");
		txtId = new TextField(20);
		lbl2 = new Label("��й�ȣ");
		txtPw = new TextField(20);
		txtPw.setEchoChar('*'); // ��й�ȣ �Է½� *�� ��� ����
		btnLogin = new Button("LOGIN");
		add(lbl1);
		add(txtId);
		add(lbl2);
		add(txtPw);
		add(btnLogin);
		setSize(new Dimension(300, 150));
		setLocation(100, 100);
		setVisible(true);
		setResizable(false);// ����ڰ� frame ������ ���� �Ұ�
	}
	public static void main(String[] args) {
		new Ex03_login("�α���");
	}
}











