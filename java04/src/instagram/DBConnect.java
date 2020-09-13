package instagram;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//connection << ?
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3366/instagram";
			String user = "root";
			String password = "1234";

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connected successfully.");

			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
