package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java5_오라클_INSERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			Scanner s = new Scanner(System.in);
			// 학번, 이름, 학과를 입력받아서
			// STUDENT 테이블에 저장
			
			
			String stuNo = "";
			while(true) {
				System.out.print("학번 입력 : ");
				stuNo = s.next();
				if(stuNo.length() != 8) {
					System.out.println("학번은 8글자 입니다.");
				} else {
					ResultSet rs =  stmt.executeQuery(
							"SELECT * FROM STUDENT WHERE STU_NO = '" + stuNo + "'");
					if(rs.next()) {
						System.out.println("이미 사용중인 학번입니다.");
					} else {
						System.out.println("사용 가능한 학번입니다.");
						break;
					}
					
				}
			}
			System.out.print("이름 입력 : ");
			String name = s.next();
			System.out.print("학과 입력 : ");
			String dept = s.next();
			String sql = "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES("
						+ "'" + stuNo + "', "
						+ "'" + name + "', "
						+ "'" + dept + "') ";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("추가되었습니다!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
