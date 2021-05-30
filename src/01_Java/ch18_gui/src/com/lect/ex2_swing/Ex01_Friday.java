package com.lect.ex2_swing;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Ex01_Friday extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel jlbl;
	private JButton jbtn;
	public Ex01_Friday(String title) {
		super(title);
		// ������ x��ư ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ �����̳�(������)�� ���� ����
		panel = (JPanel) getContentPane();
		panel.setLayout(new FlowLayout());
		jlbl = new JLabel("��ſ� �ݿ���", (int) CENTER_ALIGNMENT);
		jlbl.setPreferredSize(new Dimension(150, 200));
		jbtn = new JButton("����");
		jbtn.setPreferredSize(new Dimension(200, 200));
		panel.add(jlbl);
		panel.add(jbtn);
		setVisible(true);
		pack(); //�ּ����� �������
		jbtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbtn) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		new Ex01_Friday("�ݿ���");
	}
}
