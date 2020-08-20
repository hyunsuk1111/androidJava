package instagram;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//첫화면 - 로그인
public class Start {

	public static void main(String[] args) {
		JFrame f = new JFrame("Instagram");
		f.getContentPane().setBackground(Color.WHITE);
		//레이블 > 이미지
		ImageIcon img = new ImageIcon("InsLogo.png");
		JLabel lb1 = new JLabel(img);
		lb1.setIcon(img);
		lb1.setBounds(56, 118, 428, 146);
		f.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("굴림", Font.BOLD, 20));
		lb2.setBounds(220, 309, 84, 33);
		f.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("굴림", Font.BOLD, 20));
		lb3.setBounds(212, 384, 91, 40);
		f.getContentPane().add(lb3);
		
		//텍스트필드2개(아이디/비밀번호)
		JTextField tfID = new JTextField(10);
		tfID.setBackground(Color.WHITE);
		tfID.setBounds(171, 351, 171, 21);
		JTextField tfPW = new JTextField(15);
		tfPW.setBounds(171, 432, 171, 21);
		//버튼(로그인)
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(210, 497, 97, 23);
		f.getContentPane().setLayout(null);
		
		
		f.getContentPane().add(lb1);
		f.getContentPane().add(tfID);
		f.getContentPane().add(lb2);
		f.getContentPane().add(tfPW);
		f.getContentPane().add(btnLogin);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setBounds(210, 463, 97, 23);
		f.getContentPane().add(btnNewButton);
		

		
		
		f.setSize(540,960);
		f.setVisible(true);
		
		

	}
}
