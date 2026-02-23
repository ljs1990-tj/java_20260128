package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈_DB {
	static Scanner s = new Scanner(System.in);

	public static void runQuiz(Statement stmt) {
		try {
			int count = 0;
			while(true) {
				System.out.print("문제 수 입력 : ");
				count = s.nextInt();
				if(count >= 3 && count <= 10) {
					break;
				}
				System.out.println("3~10사이의 수 입력하셈.");
			}
			
			String sql = "SELECT * FROM (SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= " + count;
			ResultSet rs = stmt.executeQuery(sql);
			int quizNum = 1;
			int correctNum = 0;
			while(rs.next()) {
				System.out.print(quizNum + "번) " + rs.getString("COUNTRY") + " : ");
				quizNum++;
				String answer = s.next();
				if(answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답!");
					correctNum++;
				} else {
					System.out.println("오답! 정답은 " + rs.getString("CAPITAL"));
				}
			}
			System.out.println(count + "개 문제 중 " + correctNum + "개 정답!");
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
