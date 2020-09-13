package instagram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register0 extends JPanel {

	public static void main(String[] args) throws Exception {
		new Register0();
	}

	public Register0() {
		// dao 객체 생성
		UserDAO db = new UserDAO();
		// VO 객체 생성
		UserVO vo = new UserVO();
		// 회원가입 시간 객체 생성
		Date time = new Date();
		// 시간 포맷 변환
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = format1.format(time);

		ImageIcon img = new ImageIcon("InsLogo.png");
		setBackground(Color.WHITE);
		setLayout(null);

		JLabel lb = new JLabel(img);
		lb.setBounds(69, 127, 392, 116);

		JLabel lb2 = new JLabel("아이디");
		lb2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lb2.setBounds(157, 276, 73, 45);

		JLabel lb3 = new JLabel("비밀번호");
		lb3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lb3.setBounds(157, 347, 89, 45);

		JLabel lb4 = new JLabel("비밀번호 확인");
		lb4.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lb4.setBounds(157, 430, 126, 45);

		JLabel lb5 = new JLabel("전화 번호");
		lb5.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lb5.setBounds(157, 511, 107, 45);

		JTextField tfID = new JTextField(10);
		tfID.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tfID.setBackground(Color.WHITE);
		tfID.setColumns(10);
		tfID.setBounds(158, 316, 222, 31);

		JTextField tfPNum = new JTextField(10);
		tfPNum.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		tfPNum.setBackground(Color.WHITE);
		tfPNum.setColumns(10);
		tfPNum.setBounds(157, 546, 222, 31);

		JPasswordField tfPW = new JPasswordField();
		tfPW.setBounds(158, 384, 222, 31);

		JPasswordField tfPWC = new JPasswordField();
		tfPWC.setBounds(158, 465, 222, 31);

		JButton btnRegister = new JButton("회원 가입");
		btnRegister.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnRegister.setBounds(181, 659, 168, 38);
		btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 유효성 검사 - 빈칸,비밀번호
				// 검사 후 저장

				if (tfID.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "아이디 미입력");
				} else {
					// 비밀번호가 빈칸이면
					if (String.valueOf(tfPW.getPassword()).trim().isEmpty()) {
						JOptionPane.showMessageDialog(null, "비밀번호 미입력");
					} else { // 비밀번호확인이 빈칸이면
						if (String.valueOf(tfPWC.getPassword()).trim().isEmpty()) {
							JOptionPane.showMessageDialog(null, "비밀번호 확인 미입력");
						} else { // 비밀번호 불일치 시
							if (!(String.valueOf(tfPW.getPassword()).equals(String.valueOf(tfPWC.getPassword())))) {
								JOptionPane.showMessageDialog(null, "비밀번호가 불일치");
							} else { // 전화번호 빈칸이면
								if (tfPNum.getText().trim().isEmpty()) {
									JOptionPane.showMessageDialog(null, "전화번호 미입력");
								} else {
									// 유효성검사 마치고 변수에 저장
									String uID = tfID.getText();
									String uPW = String.valueOf(tfPW.getPassword());
									String uPhone = tfPNum.getText();
									String uCDate = time1;
									// 변수들 vo 가방에 저장하기
									vo.setuID(uID);
									vo.setuPW(uPW);
									vo.setuPhone(uPhone);
									vo.setuCDate(uCDate);
									try {
										db.create(vo);

									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

									JOptionPane.showMessageDialog(null, "회원가입 완료 ");

								}
							}
						}
					}
				}

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
//				JOptionPane.showMessageDialog(null, uID + "�떂 媛��엯 �셿猷�!");
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

		JButton btnNewButton = new JButton("중복 확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDAO dao = new UserDAO(); // dao 객체 생성
				String uID = tfID.getText();

				try {
					// 데이터 입력 후 중복확인 버튼 누를 시
					if (!tfID.getText().equals("")) {
						boolean result = dao.CheckID(uID);
						if (result) { // ID 중복 이면 텍스트필드 초기화
							tfID.setText("");
						}

					} else {
						JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(284, 285, 89, 23);
		add(btnNewButton);
		setVisible(true);
	}

}
