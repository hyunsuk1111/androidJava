package instagram2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register0 extends JPanel {
	
	public static void main(String[] args) {
		new Register0();
	}

	public Register0() {
		ImageIcon img = new ImageIcon("InsLogo.png");
		setBackground(Color.WHITE);
		setLayout(null);

		JLabel lb = new JLabel(img);
		lb.setBounds(74, 127, 363, 111);

		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("맑은고딕", Font.BOLD, 17));
		lb2.setBounds(157, 276, 73, 45);

		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("맑은고딕", Font.BOLD, 17));
		lb3.setBounds(157, 347, 89, 45);

		JLabel lb4 = new JLabel("비밀번호 확인");
		lb4.setFont(new Font("맑은고딕", Font.BOLD, 17));
		lb4.setBounds(157, 430, 126, 45);

		JLabel lb5 = new JLabel("전화번호");
		lb5.setFont(new Font("맑은고딕", Font.BOLD, 17));
		lb5.setBounds(157, 511, 107, 45);

		JTextField tfID = new JTextField(10);
		tfID.setFont(new Font("아이디", Font.PLAIN, 20));
		tfID.setBackground(Color.WHITE);
		tfID.setColumns(10);
		tfID.setBounds(158, 316, 222, 31);

		JTextField tfPNum = new JTextField(10);
		tfPNum.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPNum.setBackground(Color.WHITE);
		tfPNum.setColumns(10);
		tfPNum.setBounds(157, 546, 222, 31);

		JPasswordField tfPW = new JPasswordField();
		tfPW.setBounds(158, 384, 222, 31);

		JPasswordField tfPWC = new JPasswordField();
		tfPWC.setBounds(158, 465, 222, 31);

		JButton btnRegister = new JButton("회원가입 완료");
		btnRegister.setFont(new Font("맑은고딕", Font.BOLD, 20));
		btnRegister.setBounds(181, 659, 168, 38);
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				String uID = tfID.getText();
//				String uPW = String.valueOf(tfPW.getPassword());
//				String uPhone = tfPNum.getText();
//				String uCDate = "2020-08-26 11:10:23";
//
//				UserDAO dao = new UserDAO();
//				UserDTO dto = new UserDTO();
//				dto.setuID(uID);
//				dto.setuPW(uPW);
//				dto.setuPhone(uPhone);
//				dto.setuCDate(uCDate);
//
//				dao.createUser(dto);
//				JOptionPane.showMessageDialog(null, uID + "님 가입 완료!");
//
//				tfID.setText(null);
//				tfPW.setText(null);
//				tfPWC.setText(null);
//				tfPNum.setText(null);
			}
		});

		add(lb);
		add(lb2);
		add(tfID);
		add(lb3);
		add(lb3);
		add(tfPW);
		add(lb4);
		add(tfPWC);
		add(tfPNum);
		add(lb5);
		add(btnRegister);
		setSize(540, 960);
		setVisible(true);
	}
}
