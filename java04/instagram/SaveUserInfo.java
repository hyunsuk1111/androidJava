package instagram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SaveUserInfo {
	static DBConnect db = new DBConnect();
	static Connection con = db.getConnection();

	public UserVO SaveUserInfo(String uID) throws Exception {
		UserVO vo = new UserVO();
		String sql = "select * from user where uid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uID);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			String uID1 = rs.getString("uID");
			String uPhone = rs.getString("uPhone");
			vo.setuID(uID1);
			vo.setuPhone(uPhone);
		}
		return vo;

	}

}
