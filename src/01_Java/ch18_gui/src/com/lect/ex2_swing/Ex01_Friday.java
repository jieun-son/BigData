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
		// 스윙은 x버튼 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 스윙은 컨테이너(프레임)를 먼저 얻어옴
		panel = (JPanel) getContentPane();
		panel.setLayout(new FlowLayout());
		jlbl = new JLabel("즐거운 금요일", (int) CENTER_ALIGNMENT);
		jlbl.setPreferredSize(new Dimension(150, 200));
		jbtn = new JButton("종료");
		jbtn.setPreferredSize(new Dimension(200, 200));
		panel.add(jlbl);
		panel.add(jbtn);
		setVisible(true);
		pack(); //최소한의 사이즈로
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
		new Ex01_Friday("금요일");
	}
}
