package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java4_오라클_UPDATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("업데이트할 학생의 학번 입력 : ");
			String stuNo = s.next();
			
			String sql =  "UPDATE STUDENT SET "
						+ "STU_CLASS = 'D' "
						+ "WHERE STU_NO = '" + stuNo + "'";
//			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("수정되었습니다!");
			} else {
				System.out.println("해당 학번 가진 학생 없음!");
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
