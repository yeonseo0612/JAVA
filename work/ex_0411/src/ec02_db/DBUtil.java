package ec02_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB 연결 전담 클래스
public class DBUtil {
	
		private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private static final String user = "hr"; //아이디
		private static final String password = "hr"; //비밀번호
		
		public static Connection getConnection() throws SQLException {
			return DriverManager.getConnection(url,user,password);
		}
	
}
