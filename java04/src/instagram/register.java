package instagram;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//첫화면 - 로그인
public class register {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Instagram");
		ImageIcon img = new ImageIcon("InsLogo.png");
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel(img);
		lb.setBounds(74, 127, 363, 111);
		f.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("굴림", Font.BOLD, 18));
		lb2.setBounds(90, 289, 73, 45);
		f.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("이메일");
		lb3.setFont(new Font("굴림", Font.BOLD, 18));
		lb3.setBounds(90, 344, 73, 45);
		f.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("비밀번호");
		lb4.setFont(new Font("굴림", Font.BOLD, 18));
		lb4.setBounds(90, 396, 89, 45);
		f.getContentPane().add(lb4);
		
		JLabel lb5 = new JLabel("비밀번호확인");
		lb5.setFont(new Font("굴림", Font.BOLD, 18));
		lb5.setBounds(90, 447, 126, 45);
		f.getContentPane().add(lb5);
		
		JLabel lb6 = new JLabel("전화번호");
		lb6.setFont(new Font("굴림", Font.BOLD, 18));
		lb6.setBounds(90, 493, 107, 45);
		f.getContentPane().add(lb6);
		
		JButton btnRegister = new JButton("회원가입");
		btnRegister.setFont(new Font("굴림", Font.BOLD, 20));
		btnRegister.setBounds(190, 559, 133, 23);
		f.getContentPane().add(btnRegister);
		
		JTextField tfID = new JTextField(10);
		tfID.setFont(new Font("굴림", Font.PLAIN, 20));
		tfID.setBackground(Color.WHITE);
		tfID.setColumns(10);
		tfID.setBounds(215, 299, 222, 31);
		f.getContentPane().add(tfID);
		
		JTextField tfEmail = new JTextField(10);
		tfEmail.setFont(new Font("굴림", Font.PLAIN, 20));
		tfEmail.setBackground(Color.WHITE);
		tfEmail.setColumns(10);
		tfEmail.setBounds(215, 353, 222, 31);
		f.getContentPane().add(tfEmail);
		
		JTextField tfPW = new JTextField(10);
		tfPW.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPW.setBackground(Color.WHITE);
		tfPW.setColumns(10);
		tfPW.setBounds(215, 405, 222, 31);
		f.getContentPane().add(tfPW);
		
		JTextField	tfPWC = new JTextField(10);
		tfPWC.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPWC.setBackground(Color.WHITE);
		tfPWC.setColumns(10);
		tfPWC.setBounds(215, 456, 222, 31);
		f.getContentPane().add(tfPWC);
		
		JTextField tfPNum = new JTextField(10);
		tfPNum.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPNum.setBackground(Color.WHITE);
		tfPNum.setColumns(10);
		tfPNum.setBounds(215, 502, 222, 31);
		f.getContentPane().add(tfPNum);
		
		f.setSize(540,960);
		f.setVisible(true); //제일 마지막

	}
}
