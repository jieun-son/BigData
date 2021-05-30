package com.lect.ex1_awt;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ex04_login extends Frame implements ActionListener{
	private Panel panel;
	private Label lbl1;
	private TextField txtId;
	private Label lbl2;
	private TextField txtPw;
	private Button btnLogin;
	public Ex04_login(String title) {
		super(title);
		// setLayout(new BorderLayout()); �⺻��
		panel = new Panel(new GridLayout(2, 2));
		lbl1 = new Label("�� �� ��");
		txtId = new TextField(20);
		lbl2 = new Label("��й�ȣ");
		txtPw = new TextField(20);
		txtPw.setEchoChar('*'); // ��й�ȣ �Է½� *�� ��� ����
		btnLogin = new Button("LOGIN");
		panel.add(lbl1); panel.add(txtId);
		panel.add(lbl2); panel.add(txtPw);
		add(panel, BorderLayout.CENTER);
		add(btnLogin, BorderLayout.SOUTH);
		setSize(new Dimension(300, 150));
		setLocation(100, 100);
		setVisible(true);
		//setResizable(false);// ����ڰ� frame ������ ���� �Ұ�
		btnLogin.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			String id = txtId.getText().trim().toUpperCase(); // �빮�� ����
			String pw = txtPw.getText().trim();
			System.out.println("�Է��Ͻ� ID�� "+id+", ����� "+pw);
		}
	}
	public static void main(String[] args) {
		new Ex04_login("�α���");
	}
}











