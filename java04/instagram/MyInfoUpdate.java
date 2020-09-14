package instagram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyInfoUpdate {
	private static JTextField tfID;
	private static JTextField tfPhone;

	static String uID1 = "aaaa";
	static DBConnect db = new DBConnect();
	static Connection con = db.getConnection();

	public void GetUserInfo(String uID1) throws Exception {
		String sql = "select * from user where uid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uID1);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			String uID2 = rs.getString("uID");
			String uPhone = rs.getString("uPhone");
			tfID.setText(uID2);
			tfPhone.setText(uPhone);
		}
	}

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
		lb2.setBounds(161, 322, 73, 45);
		f.getContentPane().add(lb2);

		JLabel lb3 = new JLabel("현재 비밀번호");
		lb3.setFont(new Font("굴림", Font.BOLD, 17));
		lb3.setBounds(161, 404, 125, 45);
		f.getContentPane().add(lb3);

		JLabel lb4 = new JLabel("변경할 비밀번호");
		lb4.setFont(new Font("굴림", Font.BOLD, 17));
		lb4.setBounds(162, 480, 180, 45);
		f.getContentPane().add(lb4);

		JLabel lb6 = new JLabel("전화번호");
		lb6.setFont(new Font("굴림", Font.BOLD, 17));
		lb6.setBounds(163, 628, 107, 45);
		f.getContentPane().add(lb6);

		tfID = new JTextField(10);
		tfID.setFont(new Font("굴림", Font.PLAIN, 20));
		tfID.setBackground(Color.WHITE);
		tfID.setColumns(10);
		tfID.setBounds(163, 355, 202, 31);
		f.getContentPane().add(tfID);

		tfPhone = new JTextField(10);
		tfPhone.setFont(new Font("굴림", Font.PLAIN, 20));
		tfPhone.setBackground(Color.WHITE);
		tfPhone.setColumns(10);
		tfPhone.setBounds(163, 662, 202, 31);
		f.getContentPane().add(tfPhone);

		JPasswordField tfPW = new JPasswordField();
		tfPW.setBounds(163, 439, 202, 31);
		f.getContentPane().add(tfPW);

		JPasswordField tfCpw = new JPasswordField();
		tfCpw.setBounds(163, 516, 202, 31);
		f.getContentPane().add(tfCpw);

		JLabel lb5 = new JLabel("변경할 비밀번호 확인");
		lb5.setFont(new Font("굴림", Font.BOLD, 17));
		lb5.setBounds(161, 557, 180, 45);
		f.getContentPane().add(lb5);

		JPasswordField tfCpwC = new JPasswordField();
		tfCpwC.setBounds(162, 593, 201, 31);
		f.getContentPane().add(tfCpwC);

		// 아이디랑 전화번호 저장
		try {
			MyInfoUpdate miu = new MyInfoUpdate();
			miu.GetUserInfo(uID1);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		JButton btnUpdate = new JButton("수정완료");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDAO dao = new UserDAO();
				UserVO vo = new UserVO();
				String uID = tfID.getText();
				String uPW = String.valueOf(tfPW.getPassword());
				// 변경할비번 과 변경할비번확인 이 같다면 변수에 저장
				String cPW = String.valueOf(tfCpw.getPassword()); // 변경할 비번
				String cPWC = String.valueOf(tfCpwC.getPassword());
				String uPhone = tfPhone.getText();
				// 가방에 데이터 담기
				vo.setuID(uID);
				vo.setuPW(uPW);
				vo.setcPW(cPW);
				vo.setcPWC(cPWC);
				vo.setuPhone(uPhone);
				try {
					dao.update(vo);

					// 회원정보 수정 전송
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnUpdate.setBounds(174, 750, 168, 38);
		f.getContentPane().add(btnUpdate);

		JButton btnDelete = new JButton("회원탈퇴");
		btnDelete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				UserDAO dao = new UserDAO(); // dao 객체생성
				UserVO vo = new UserVO(); // vo 생성
				String uID = tfID.getText();
				try {
					// 버튼 메시지
					String[] options = new String[] { "확인", "취소" };
					// 비밀번호 입력칸 생성
					JPasswordField ps = new JPasswordField();
					int pw = JOptionPane.showOptionDialog(null, ps, "비밀번호를 입력하세요", JOptionPane.NO_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
					if (pw == 0) { // 확인 버튼 클릭 시
						String uPW = String.valueOf(ps.getPassword());
						vo.setuID(uID); // 가방에 넣기
						vo.setuPW(uPW); 
						dao.delete(vo);
					} else {
						JOptionPane.showMessageDialog(null, "취소되었습니다.");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnDelete.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnDelete.setBounds(174, 803, 168, 38);
		f.getContentPane().add(btnDelete);

		JButton btnNewButton = new JButton("유저정보저장");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					UserDAO dao = new UserDAO();
					FileSave fs = new FileSave();
					// 리스트에 유저정보 vo 저장
					ArrayList<UserVO> list = dao.getUser();
					// 파일 저장 메서드 호출
					fs.FileSave(list);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton.setBounds(174, 851, 168, 31);
		f.getContentPane().add(btnNewButton);

		f.setSize(540, 960);
		f.setVisible(true); // 제일 마지막

	}

}
