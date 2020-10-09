package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//CRUD 중심으로 기능을 정의
//데이터와 관련된 작업(Data Access object : DAO)
public class classDAO {
	// 기능을 정의할 때는 메서드(함수)를 사용한다.
	Connection con;
	DBConnectionMgr dbcp;
	public classDAO() throws Exception {
//		con = dbcp.getConnection();// DB프로그램 절차에 맞게 코딩
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결");
		// 2. db연결
		// String url "연결하는방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/bc?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, user, password);

		System.out.println("2. db연결성공!");
	}

	public boolean create(classVO vo) throws Exception {
		// 강의 등록
		String sql = "insert into class(cTitle,cType,cAddress,cInfo,cLimit,cPrice,cCurriculum,tID,cImg,tCrt,cDay,cTime) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 생성 성공");
		String tID = "jw123";
		
		ps.setString(1, vo.getcTitle());
		ps.setString(2, vo.getcType());
		ps.setString(3, vo.getcAddress());
		ps.setString(4, vo.getcInfo());
		ps.setInt(5, vo.getcLimit());
		ps.setInt(6, vo.getcPrice());
		ps.setString(7, vo.getcCurriculum());
		ps.setString(8, tID);
		ps.setString(9, vo.getcImg());
		ps.setString(10, vo.gettCrt());
		ps.setString(11, vo.getcDay());
		ps.setString(12, vo.getcTime());

		int row = ps.executeUpdate();
		System.out.println("4. sql전송 성공");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		con.close();
		ps.close();
		return result;

	}


//	public List<teacherVO> all() throws Exception {
//		// 3. sql문을 만든다.
//		String sql = "select * from member";
//		PreparedStatement ps = con.prepareStatement(sql);
//
//		// 4. sql문은 전송
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. SQL문 전송 성공.!!");
//
//		List<teacherVO> list = new ArrayList<teacherVO>();
//		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
//			teacherVO bag = new teacherVO();// 가방만들어서,
//			bag.setId(rs.getString("id"));
//			bag.setPw(rs.getString("pw"));
//			bag.setName(rs.getString("name"));
//			bag.setTel(rs.getString("tel"));
//			list.add(bag);
//		}
//		return list;
//	}
	public ArrayList<classVO> all(String cTitle) throws Exception {
		// 3. sql문을 만든다.
		String sql = "select * from class where cTitle = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cTitle);

		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		ArrayList<classVO> list = new ArrayList<classVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			classVO bag = new classVO();// 가방만들어서,
			bag.setcTitle(rs.getString("cTitle"));
			bag.setcType(rs.getString("cType"));
			bag.setcDay(rs.getString("cDay"));
			bag.setcTime(rs.getString("cTime"));
			bag.setcLimit(rs.getInt("cLimit"));
			bag.setcInfo(rs.getString("cInfo"));
			bag.setcCurriculum(rs.getString("cCurriculum"));
			bag.setcAddress(rs.getString("cAddress"));
			bag.setcPrice(rs.getInt("cPrice"));
			bag.settCrt(rs.getString("tCrt"));
			list.add(bag);
		}
		return list;
	}
}
//	//특정 검색어로 가져오기2)
//	public List<teacherVO> all2(String tel) throws Exception {
//		// 3. sql문을 만든다.
//		String sql = "select * from member where tel like '" + tel + "%'";
//		PreparedStatement ps = con.prepareStatement(sql);
//
//		// 4. sql문은 전송
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. SQL문 전송 성공.!!");
//		List<teacherVO> list = new ArrayList<teacherVO>();
//		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
//			teacherVO bag = new teacherVO();// 가방만들어서,
//			bag.setId(rs.getString("id"));
//			bag.setPw(rs.getString("pw"));
//			bag.setName(rs.getString("name"));
//			bag.setTel(rs.getString("tel"));
//			list.add(bag);
//		}
//		return list;
//	}
//
//	public boolean create(String id, String pw, String name, String tel) throws Exception {
//		// DB프로그램 절차에 맞게 코딩
//		// 3. sql문을 만든다
//		String sql = "insert into member values (?,?,?,?)";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		ps.setString(2, pw);
//		ps.setString(3, name);
//		ps.setString(4, tel);
//		System.out.println("3. sql문 생성 성공");
//
//		// 4. sql문을 전송
//		int row = ps.executeUpdate();
//		System.out.println("4. sql전송 성공");
//		boolean result = false;
//		if (row == 1) {
//			result = true;
//		}
//		ps.close();
//		con.close();
//		return result;
//	}
//

//
//	// id 검색
//	public teacherVO one(String id) throws Exception {
//		// DB프로그램 절차에 맞게 코딩
//		// 3. sql문을 만든다
//		// select의 결과는 검색결과가 담긴 테이블(항복+내용)
//		// 내용에는 없을 수도 있고, 많을 수도 있음.
//		String sql = "select * from member where id =  ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		System.out.println("3. sql문 생성 성공");
//		int result = 0;
//		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql전송 성공");
//		teacherVO bag = new teacherVO(); // 가방만들어서
//		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
//			System.out.println("검색결과있음");
//			String id2 = rs.getString("id");
//			String pw2 = rs.getString("pw");
//			String name2 = rs.getString("name");
//			String tel2 = rs.getString("tel");
//			bag.setId(id2);
//			bag.setPw(pw2);
//			bag.setName(name2);
//			bag.setTel(tel2);
//		} else {
//			System.out.println("검색결과없음");
//		}
//		rs.close();
//		ps.close();
//		con.close();
//		return bag;
//		// bag은 참조형 변수, 주소를 전달!
//	}
//
//	// id 중복 체크
//	public boolean read(String id) throws Exception {
//		String sql = "select * from member where id =  ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		System.out.println("3. sql문 생성 성공");
//		boolean result = true;
//		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql전송 성공");
//
//		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
//			System.out.println("검색결과있음");
//			result = false; // 검색결과 있음
//			String id2 = rs.getString("id");
//			String pw2 = rs.getString("pw");
//			String name2 = rs.getString("name");
//			String tel2 = rs.getString("tel");
////			System.out.println("검색결과 : " + id2);
////			System.out.println("검색결과 : " + pw2);
////			System.out.println("검색결과 : " + name2);
////			System.out.println("검색결과 : " + tel2);
//
//		} else {
//			System.out.println("검색결과없음");
//		}
//		rs.close();
//		ps.close();
//		con.close();
//		return result;
//		// 0이 넘어가면 검색결과 x
//		// 1이 넘어가면 검색결과 o
//
//	}
//
//	// id, pw 맞는지 로그인 처리
//	public boolean read(String id, String pw) throws Exception {
//		
//		String sql = "select * from member where id =  ? and pw = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, id);
//		ps.setString(2, pw);
//
//		System.out.println("3. sql문 생성 성공");
//		// 4. sql문을 전송 , type에 따라서 setint ~ 웬만하면 setsting
//		ResultSet rs = ps.executeQuery();
//		System.out.println("4. sql전송 성공");
//		boolean result = false;
//
//		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
//			System.out.println("로그인ok");
//			result = true; // 검색결과 있음
//		} else {
//			System.out.println("로그인not");
//		}
//		rs.close();
//		ps.close();
//		con.close();
//		return result;
//		// false면 로그인not
//		// true면 로그인ok
//
//	}
//
//	public boolean update(teacherVO vo) throws Exception {
//		// 3. sql문을 만든다.(create)
//		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, vo.getPw());
//		ps.setString(2, vo.getName());
//		ps.setString(3, vo.getTel());
//		ps.setString(4, vo.getId());
//		System.out.println("3. SQL생성 성공.!!");
//
//		// 4. sql문은 전송
//		int row = ps.executeUpdate();
//		System.out.println("4. SQL문 전송 성공.!!");
//		ps.close();
//		con.close();
//		boolean result = false;
//		if (row == 1) {
//			result = true;
//		}
//		return result;
//	}
//
//	public boolean delete(String id) throws Exception {
//		// 3. sql 문작성
//		String sql = "delete from member where id = (?)";
//		PreparedStatement ps = con.prepareStatement(sql);
//		System.out.println("3. sql문 생성 성공");
//		ps.setString(1, id);
//		int row = ps.executeUpdate();
//		System.out.println("4. sql문 전송 성공");
//		ps.close();
//		con.close();
//		boolean result = false;
//		if (row == 1) {
//			result = true;
//		}
//		return result;
//
//	}
