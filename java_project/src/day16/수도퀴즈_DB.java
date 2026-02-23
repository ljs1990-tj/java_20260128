package day16;

import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈_DB {
	static Scanner s = new Scanner(System.in);

	public static void runQuiz(Statement stmt) {
		try {
			String sql = "SELECT * FROM (SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= 5";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void addQuiz(Statement stmt) {}
	public static void editQuiz(Statement stmt) {}
	public static void removeQuiz(Statement stmt) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		boolean closeFlg = true;
		while(closeFlg) {
			System.out.print("[ 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료 ] : ");
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				runQuiz(stmt);
				break;
			case 2:
				addQuiz(stmt);
				break;
			case 3:
				editQuiz(stmt);
				break;
			case 4:
				removeQuiz(stmt);
				break;
			case 5:
				System.out.println("종료되었습니다.");
				closeFlg = false;
				break;
			default:
				System.out.println("1~5중에 선택해주세요.");
				break;
			}
		}
		
	}
}
