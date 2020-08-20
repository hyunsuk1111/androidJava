package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽1 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드 >> 객체지향형 프로그래밍(OOP)
		// ctrl + shift + o 자동 import
		JFrame f = new JFrame();//new는 복사의 의미
		JButton b1 = new JButton();
		//b1 버튼 클릭 시
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를눌러요");
			}
		});
		//b2 버튼 클릭 시 
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나도눌러요");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "사진클릭했네요");
			}
		});
		//String img = "sky.png";
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("나를 눌러요");
		b2.setText("나도 눌러요");
		b3.setIcon(img);
		
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		f.setSize(700,300);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		//맨아래에 설정해야합니다.
		f.setVisible(true);
	}

}
