package instagram2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//첫화면 - 로그인
public class register {
	private static JPasswordField tfPW;
	private static JPasswordField tfPWC;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Instagram");
		ImageIcon img = new ImageIcon("InsLogo.png");
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel(img);
		lb.setBounds(74, 127, 363, 111);
		f.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("굴림", Font.BOLD, 17));
		lb2.setBounds(157, 276, 73, 45);
		f.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("굴림", Font.BOLD, 17));
		lb3.setBounds(157, 347, 89, 45);
		f.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("비밀번호 확인");
		lb4.setFont(new Font("굴림", Font.BOLD, 17));
		lb4.setBounds(157, 430, 126, 45);
		f.getContentPane().add(lb4);
		
		JLabel lb5 = new JLabel("전화번호");
		lb5.setFont(new Font("굴림", Font.BOLD, 17));
		lb5.setBounds(157, 511, 107, 45);
		f.getContentPane().add(lb5);
		
		JButton btnRegister = new JButton("회원가입");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//register(id)
			}
		});
		btnRegister.setFont(new Font("굴림", Font.BOLD, 20));
		btnRegister.setBounds(181, 659, 168, 38);
		f.getContentPane().add(btnRegister);
		
		JTextField tfID = new JTextField(10);
		tfID.setFont(new Font("굴림", Font.PLAIN, 20));
		tfID.setBackground(Color.WHITE);
		tfID.setColumns(10);
		tfID.setBounds(158, 316, 222, 31);
		f.getContentPane().add(tfID);
		
		JTextField tfPNum = new JTextField(10);
		tfPNum.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPNum.setBackground(Color.WHITE);
		tfPNum.setColumns(10);
		tfPNum.setBounds(157, 546, 222, 31);
		f.getContentPane().add(tfPNum);
		
		tfPW = new JPasswordField();
		tfPW.setBounds(158, 384, 222, 31);
		f.getContentPane().add(tfPW);
		
		tfPWC = new JPasswordField();
		tfPWC.setBounds(158, 465, 222, 31);
		f.getContentPane().add(tfPWC);
		
		f.setSize(540,960);
		f.setVisible(true); //제일 마지막

	}
}
