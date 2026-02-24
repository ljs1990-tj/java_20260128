package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈_DB {
	static Scanner s = new Scanner(System.in);

	public static boolean login(Statement stmt) {
		try {
			while(true) {
				System.out.print("[ 1. 로그인, 2. 회원가입, 3. 종료 ] : ");
				int menu = s.nextInt();
				if(menu == 1) {
					
					return true;
				} else if(menu == 2) {
					System.out.print("아이디 : ");
					String id = s.next();
					String sql = "SELECT * FROM TBL_USER WHERE USERID = '" + id + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("이미 사용중인 아이디입니다.");
					} else {
						System.out.print("비밀번호 : ");
						String pwd = s.next();
						System.out.print("이름 : ");
						String name = s.next();
						sql = "INSERT INTO TBL_USER VALUES("
							+ "'" + id + "',"
							+ "'" + pwd + "',"
							+ "'" + name + "')";
						int result = stmt.executeUpdate(sql);
						if(result > 0) {
							System.out.println(name + "님 회원가입을 환영합니다!");
						} else {
							System.out.println("오류가 발생했음. 다시 시도 해주셈");
						}
						
					}
					
				} else if(menu == 3) {
					System.out.println("종료되었습니다.");
					return false;
				} else {
					System.out.println("1~3중에 선택해주세요.");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return true;
	}
	
	
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
	public static void addQuiz(Statement stmt) {
		try {
			// 추가할 나라 이름 입력 받은 후 db에 있는지 없는지 확인
			System.out.print("추가할 나라 이름 : ");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("이미 등록된 나라 입니다.");
			} else {
				System.out.print("수도를 입력해주세요 : ");
				String capital = s.next();
				sql = "INSERT INTO TBL_QUIZ VALUES(QUIZ_SEQ.NEXTVAL, "
						+ "'" + country + "',"
						+ "'" + capital + "')";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("등록되었다!");
				} else {
					System.out.println("등록에 실패함");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	public static void editQuiz(Statement stmt) {
		
		try {
			System.out.print("수정할 나라 이름 : ");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE COUNTRY = '" + country + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.print("현재 등록된 수도명은 " + rs.getString("CAPITAL") + " 입니다.");
				System.out.print("수정 하실래? (Y/N) ");
				while(true) {
					String yn = s.next();
					if(yn.toLowerCase().equals("y")) {
						System.out.print("수정할 수도명 : ");
						String capital = s.next();
						sql = "UPDATE TBL_QUIZ SET "
							+ "CAPITAL = '" + capital + "' "
							+ "WHERE COUNTRY = '" + country + "'";
						int result = stmt.executeUpdate(sql);
						if(result > 0) {
							System.out.println("수정 됨!");
						} else {
							System.out.println("실패 함!");
						}
						break;
					} else if(yn.toLowerCase().equals("n")) {
						break;
					} else {
						System.out.print("Y/N 중에 입력하셈 : ");
					}
				}
					
				
			} else {
				System.out.println("없는 나라 이름임");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void removeQuiz(Statement stmt) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문제 풀이, 2. 문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		boolean closeFlg = login(stmt);
		
//		boolean closeFlg = true;
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
