package instagram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UserDAO {
	// 객체 생성하지 않아도 접근가능
	static DBConnect db = new DBConnect();
	static Connection con = db.getConnection();

	// 회원가입
	public void create(UserVO vo) throws Exception {
		//sql 문 작성
		String sql = "insert into user values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getuID());
		ps.setString(2, vo.getuPW());
		ps.setString(3, vo.getuPhone());
		ps.setString(4, vo.getuCDate());
		ps.executeUpdate();
	}

	// 중복체크
	public boolean CheckID(String uID) throws Exception {
		Register0 register = new Register0();
		boolean result = false;
		// sql 문 작성
		String sql = "select * from user where uID = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uID);
		// query문 전송
		ResultSet rs = ps.executeQuery();
		// id가 존재하면
		if (rs.next()) {
			JOptionPane.showMessageDialog(null, "아이디 중복");
			result = true;

		} else { // id 존재하지 않는다면
			JOptionPane.showMessageDialog(null, "아이디 사용 가능");
		}
		return result;
	}

	// 로그인
	public void read(UserVO vo) throws Exception {
		// sql 문 작성
		String sql = "select * from user where uID = ? and uPW = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getuID());
		ps.setString(2, vo.getuPW());
		// query문 전송
		ResultSet rs = ps.executeQuery();

		// id가 존재하면
		if (rs.next()) {
			JOptionPane.showMessageDialog(null, "로그인 성공");

		} else { // id 존재하지 않는다면
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

	}

	// 회원탈퇴
	public void delete(UserVO vo) throws Exception {
		// sql 문 작성
		String sql1 = "select * from user where uID = ? and uPW = ?";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setString(1, vo.getuID());
		ps1.setString(2, vo.getuPW());
		ResultSet rs = ps1.executeQuery();

		if (rs.next()) {
			// 예 - 0 / 아니오 - 1 반환
			int result2 = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?");
			if (result2 == 0) {
				String sql2 = "delete from user where uID = ?";
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps2.setString(1, vo.getuID());
				ps2.executeUpdate();
				JOptionPane.showMessageDialog(null, "삭제완료");
			} else {
				JOptionPane.showMessageDialog(null, "삭제취소");
			}
		} else {
			JOptionPane.showMessageDialog(null, "비밀번호 불일치");

		}
	}

	// 회원정보수정 > 로그인 된 상태에서 진행
	public void update(UserVO vo) throws Exception {
		// sql 문 작성
		String sql1 = "select * from user where uID = ? and uPW =?";
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ps1.setString(1, vo.getuID());
		ps1.setString(2, vo.getuPW());
		ResultSet rs = ps1.executeQuery();
		// id와 현재 비밀번호가 일치하는지 확인
		if (!(rs.next())) {
			JOptionPane.showMessageDialog(null, "비밀번호가 올바르지 않습니다.");
		} else { // id와 비밀번호가 일치하다면
			// 변경할 비번과 변경할 비번체크가 일치하지 않거나 공백일경우
			if (!(vo.cPW.equals(vo.cPWC)) || vo.cPW.equals("") || vo.cPWC.equals("")) {
				JOptionPane.showMessageDialog(null, "변경할 비밀번호가 올바르지 않습니다.");
			} else { // 모두 만족한다면 회원정보 수정
				int result = JOptionPane.showConfirmDialog(null, "수정하시겠습니까?");
				if (result == 0) { // 0 이면 예, 1 아니오
					String sql2 = "update user set uPW = ? where uid = ?";
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.setString(1, vo.getcPW());
					ps2.setString(2, vo.getuID());
					ps2.executeUpdate();
					JOptionPane.showMessageDialog(null, "회원정보 수정 완료");

				} else {
					JOptionPane.showMessageDialog(null, "회원정보 수정 취소");

				}
			}
		}

	}

	// 유저 정보 파일로 저장
	public ArrayList<UserVO> getUser() throws Exception {
		// 리스트생성
		ArrayList<UserVO> list = new ArrayList<UserVO>();
		// sql 문 작성
		String sql = "select * from user";
		PreparedStatement ps1 = con.prepareStatement(sql);
		ResultSet rs = ps1.executeQuery();
		while (rs.next()) {
			UserVO vo = new UserVO();
			String uID = rs.getString("uID");
			String uPW = rs.getString("uPW");
			String uPhone = rs.getString("uPhone");
			String uCDate = rs.getString("uCDate");
			// 가방에 넣기
			vo.setuID(uID);
			vo.setuPW(uPW);
			vo.setuPhone(uPhone);
			vo.setuCDate(uCDate);
			// 리스트에 담기
			list.add(vo);

		}
		return list;

	}
}
