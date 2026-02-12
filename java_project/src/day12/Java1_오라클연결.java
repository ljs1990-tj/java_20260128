package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java1_오라클연결 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
//			System.out.println("DB 연결 완료");
			
			ResultSet rs =  stmt.executeQuery("SELECT * FROM STUDENT");
			
			while(rs.next()) {
				System.out.print(rs.getString("STU_NO") + " || ");
				System.out.print(rs.getString("STU_NAME") + " || ");
				System.out.println(rs.getString("STU_DEPT"));
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
