package day14;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class Java9_DB {
	
	public static int inputScore(String subject) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + " : ");
			score = s.nextInt();
			if(score >= 0 && score <= 100) {
				break;
			} else {
				System.out.println("0~100 사이 값을 입력해주세요.");
			}
		}
		return score;
	}
	
	public static void searchStudent(Statement stmt) {
		try {
			String sql = "SELECT * FROM TBL_STUDENT";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print("학번 : " + rs.getString("STU_NO") + ", ");
				System.out.println("이름 : " + rs.getString("STU_NAME"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void addStudent(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			String stuNo = "";
			while(true) {
				System.out.print("학번 : ");
				stuNo = s.next();
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.println("이미 사용중인 학번입니다.");
					continue;
				}
				break;
			}
			
			System.out.print("이름 : ");
			String name = s.next();
			System.out.print("학과 : ");
			String dept = s.next();
			
			String sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT) "
						+ "VALUES(" 
						+ "'" + stuNo + "'," 
						+ "'" + name + "',"
						+ "'" + dept + "')";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("추가되었다!");
			} else {
				System.out.println("잘못되었다!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void removeStudent(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("삭제할 학생 학번 입력 : ");
			String stuNo = s.next();
			String sql = "DELETE FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("삭제되었습니다!");
			} else {
				System.out.println("삭제에 실패했습니다!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void editStudent(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			String stuNo = "";
			while(true) {
				System.out.print("학번 : ");
				stuNo = s.next();
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.print("[ 1. 자바, 2. 오라클, 3. HTML ] : ");
					int menu = s.nextInt();
					int score = 0;
					String subject = "";
					switch (menu) {
					case 1:
						score = inputScore("자바");
						subject = "JAVA";
						break;
					case 2:
						score = inputScore("오라클");
						subject = "ORACLE";
						break;
					case 3:
						score = inputScore("HTML");
						subject = "HTML";
						break;
					default:
						System.out.println("1~3중에 선택해주세요.");
						break;
					}
					
					sql = "UPDATE TBL_STUDENT SET " 
							 + subject + " = " + score + " "
							 + "WHERE STU_NO = '" + stuNo + "'";
					
					int result = stmt.executeUpdate(sql);
					if(result > 0) {
						System.out.println("수정되었습니다!");
					} else {
						System.out.println("수정에 실패했습니다!");
					}
					
					break;
				} else {
					System.out.println("없는 학번 입니다.");
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		// 1. 검색, 2. 추가, 3. 수정, 4. 삭제
		while(true) {
			System.out.print("[ 1. 검색, 2. 추가, 3. 수정, 4. 삭제 ] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				searchStudent(stmt);
			} else if(menu == 2) {
				addStudent(stmt);
			} else if(menu == 3) {
				editStudent(stmt);
			} else if(menu == 4) {
				removeStudent(stmt);
			} else if(menu == 5) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~5사이 메뉴 선택하세요.");
			}
			
			
		}
	}

}
