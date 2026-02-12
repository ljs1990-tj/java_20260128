package day12;

import java.sql.SQLException;
import java.sql.Statement;

public class Java2_오라클_삭제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '12123434'");
			if(result > 0) {
				System.out.println("삭제되었습니다!"); 
			} else {
				System.out.println("해당 학생 없음!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
