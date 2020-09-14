package instagram;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	private static JTextField tfID;
	private static JPasswordField tfPW;

	public static void main(String[] args) {
		new Login();
	}

	public Login() {
		ImageIcon img = new ImageIcon("InsLogo.png");
		setBackground(Color.WHITE);
		setLayout(null);

		JLabel lb = new JLabel(img);
		lb.setBounds(69, 127, 392, 116);

		tfID = new JTextField();
		tfID.setBounds(163, 369, 222, 31);
		tfID.setColumns(10);
		tfPW = new JPasswordField();
		tfPW.setBounds(163, 468, 222, 31);

		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dao 객체 생성
				UserDAO dao = new UserDAO();
				// vo 객체 생성
				UserVO vo = new UserVO();
				// String PW = new String(tfPW.getPassword());
				// 빈칸 체크 , trim - 빈칸제거
				if (tfID.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "아이디 미입력");
				} else {
					if (String.valueOf(tfPW.getPassword()).trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "비밀번호 미입력");
					} // 추가)DB 데이터와 불일치시 로그인 실패
					else {
						String uID = tfID.getText();
						String uPW = String.valueOf(tfPW.getPassword());
						// vo객체에 데이터 저장
						vo.setuID(uID);
						vo.setuPW(uPW);
						try {
							SaveUserInfo save = new SaveUserInfo();
							// 로그인
							dao.read(vo);
							// 로그인정보저장
							UserVO vo1 = save.SaveUserInfo(uID);
							
						} catch (Exception e1) {
							e1.printStackTrace();
						}

					}
				}

			}
		});
		btnLogin.setBounds(163, 581, 210, 38);
		JButton btnRegister = new JButton("회원가입");
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeAll();
				Register register = new Register();
				add(register);
				repaint();

			}
		});

		btnRegister.setBounds(163, 641, 210, 38);
		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("굴림", Font.BOLD, 17));
		lb2.setBounds(163, 337, 57, 31);
		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("굴림", Font.BOLD, 17));
		lb3.setBounds(163, 441, 91, 23);

		add(btnRegister);
		add(btnLogin);
		add(lb2);
		add(lb3);
		add(tfID);
		add(lb);
		add(tfPW);
		setSize(540, 940);
		setLayout(null);
		setVisible(true);

	}

}
