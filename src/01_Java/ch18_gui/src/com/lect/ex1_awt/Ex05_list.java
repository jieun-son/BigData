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
		// layout셋팅 , 컴포넌트 생성 후 add, setVisible, setSize....
		// setLayout(new BorderLayout());
		panel = new Panel(); // panel의 기본 레이아웃은 new FlowLayout()
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
		// 2. 이벤트 리스너 추가
		// 3. 로직 추가
		btnOk.addActionListener(this);
		btnExit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			// txtField의 텍스트를 list추가하고 txtField는 빈스트링으로
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





