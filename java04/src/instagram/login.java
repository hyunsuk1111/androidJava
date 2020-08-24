package instagram;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class login {
	private static JTextField tfID;
	private static JPasswordField tfPW;

	public static void main(String[] args) {
		JFrame f = new JFrame("instagram");
		ImageIcon img = new ImageIcon("InsLogo.png");
		f.getContentPane().setBackground(Color.WHITE);
		f.getContentPane().setLayout(null);
		
		JLabel lb = new JLabel(img);
		lb.setBounds(74, 127, 363, 111);
		f.getContentPane().add(lb);
	
		f.setSize(540, 940);
		f.getContentPane().setLayout(null);
		
		tfID = new JTextField();
		
		tfID.setBounds(163, 369, 222, 31);
		
		f.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		tfPW = new JPasswordField();
		tfPW.setBounds(163, 468, 222, 31);
		
		f.getContentPane().add(tfPW);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PW = new String(tfPW.getPassword());
				JOptionPane.showMessageDialog(f, PW);
				
			}
		});
		btnNewButton.setBounds(163, 581, 210, 38);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBounds(163, 641, 210, 38);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("굴림", Font.BOLD, 17));
		lb2.setBounds(163, 337, 57, 31);
		f.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("굴림", Font.BOLD, 17));
		lb3.setBounds(163, 441, 91, 23);
		f.getContentPane().add(lb3);
		
		

	}
}
