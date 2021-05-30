package com.lect.ex1_awt;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ex05_list extends Frame implements ActionListener{
	private Panel panel;
	private TextField txtField;
	private Button btnOk, btnExit;
	private List   list;
	public Ex05_list() {
		// layout���� , ������Ʈ ���� �� add, setVisible, setSize....
		// setLayout(new BorderLayout());
		panel = new Panel(); // panel�� �⺻ ���̾ƿ��� new FlowLayout()
		txtField = new TextField(20);
		btnOk = new Button("OK");
		btnExit = new Button("EXIT");
		list = new List();
		panel.add(new Label("write"));
		panel.add(txtField);
		panel.add(btnOk);
		panel.add(btnExit);
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		setVisible(true);
		setSize(new Dimension(400, 200));
		// 1. implements ActionListener
		// 2. �̺�Ʈ ������ �߰�
		// 3. ���� �߰�
		btnOk.addActionListener(this);
		btnExit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			// txtField�� �ؽ�Ʈ�� list�߰��ϰ� txtField�� ��Ʈ������
			list.add(txtField.getText());
			txtField.setText("");
		}else if(e.getSource() == btnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		new Ex05_list();
	}
}





