package instagram2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//첫화면 -> 로그인 or 회원가입
public class Start {

	public static void main(String[] args) {
		JFrame f = new JFrame("Instagram");
		f.getContentPane().setBackground(Color.WHITE);
		//레이블 > 이미지
		ImageIcon img = new ImageIcon("InsLogo.png");
		JLabel lb1 = new JLabel(img);
		lb1.setIcon(img);
		lb1.setBounds(74, 127, 363, 111);
		f.getContentPane().add(lb1);
		//버튼(로그인)
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setFont(new Font("굴림", Font.BOLD, 20));
		btnLogin.setBounds(103, 527, 325, 37);
		f.getContentPane().setLayout(null);
		
		
		f.getContentPane().add(lb1);
		f.getContentPane().add(btnLogin);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(103, 595, 325, 37);
		f.getContentPane().add(btnNewButton);
		

		
		
		f.setSize(540,960);
		f.setVisible(true);
		
		

	}
}
