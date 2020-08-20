package 그래픽Swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JDesktopPane;

public class 나의그래픽4_비교 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame();
		//레이블3
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 40));
		l1.setText("숫자1");
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 40));
		l2.setText("숫자2");
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 30));
		//텍스트입력2
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.BOLD, 40));
		//버튼1
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//데이터 get
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//String > int 변환
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				//int n3 = Integer.parseInt(t1.getText());
				
				//n1 n2보다 크다면, 작다면
				if(n1 > n2) {
					l3.setText(s1);
				}else {
					l3.setText(s2);
				}
				
			}
		});
		b1.setText("결과");
		//레이아웃
		FlowLayout flow = new FlowLayout();//*
		f.getContentPane().setLayout(flow);//*
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(l3);
		f.setSize(400, 400);
		f.setVisible(true);//*
		
		
		
	}

}
