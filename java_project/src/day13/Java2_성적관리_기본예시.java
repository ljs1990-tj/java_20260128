package day13;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day12.Message;

public class Java2_성적관리_기본예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt =  db.getStmt();
		
		try {
			while(true) {
				System.out.print("[1. 학생추가, 2. 성적입력, 3. 성적확인, 4. 성적수정, 5.종료] : ");
				int menu = s.nextInt();
				String stuNo = "";
				String stuName = "";
				String stuDept = "";
				ResultSet rs = null;
				switch (menu) {
				case 1:
					
					while(true) {
						System.out.print("학번 : ");
						stuNo = s.next();
						if(stuNo.length() == 4) {
							String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
							rs =  stmt.executeQuery(sql);
							if(rs.next()) {
								System.out.println("이미 사용중인 학번임");
							} else {
								System.out.print("이름 : ");
								stuName = s.next();
								System.out.print("학과 : ");
								stuDept = s.next();
								sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES("
											+ "'" + stuNo + "',"
											+ "'" + stuName + "',"
											+ "'" + stuDept + "')";
								int result = stmt.executeUpdate(sql);
								if(result > 0) {
									System.out.println("추가 됨!");
								} else{
									System.out.println(Message.faileMsg);
								}
								break;
							}
						} else {
							System.out.println("4자리로 입력하셈");
						}
					}
					break;
				case 2:
					System.out.print("학번 : ");
					stuNo = s.next();
					String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
					rs =  stmt.executeQuery(sql);
					if(rs.next()) {
						int java = 0;
						int oracle = 0;
						int html = 0;
						while(true) {
							System.out.print("자바 : ");
							java = s.nextInt();
							if(java >= 0 && java <= 100) {
								break;
							} else {
								System.out.println("0~100 사이 입력하셈");
							}
						}
						
						while(true) {
							System.out.print("오라클 : ");
							oracle = s.nextInt();
							if(oracle >= 0 && oracle <= 100) {
								break;
							} else {
								System.out.println("0~100 사이 입력하셈");
							}
						}
						
						while(true) {
							System.out.print("HTML : ");
							html = s.nextInt();
							if(html >= 0 && html <= 100) {
								break;
							} else {
								System.out.println("0~100 사이 입력하셈");
							}
						}
						sql = "UPDATE TBL_STUDENT SET "
								+ "JAVA = " + java + ", "
								+ "ORACLE = " + oracle + ", "
								+ "HTML = " + html + " "
								+ "WHERE STU_NO = '" + stuNo + "'";
						int result = stmt.executeUpdate(sql);
						if(result > 0) {
							System.out.println("업데이트 했다!");
						} else {
							System.out.println("실패!");
						}
						
					} else {
						System.out.println("해당 학번 학생 없음");
					}
					break;
				case 3:
					System.out.print("학번 : ");
					stuNo = s.next();
					sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
					rs =  stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.print("[" + rs.getString("STU_NAME") + "] ");
						System.out.print("자바 : " + rs.getInt("JAVA") + ", ");
						System.out.print("오라클 : " + rs.getInt("ORACLE") + ", ");
						System.out.println("HTML : " + rs.getInt("HTML"));
					} else {
						System.out.println("해당 학번 학생 없음");
					}
					break;
				case 4:
					System.out.print("학번 : ");
					stuNo = s.next();
					sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
					rs =  stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.print("[1. 자바, 2. 오라클, 3. HTML] : ");
						int subject = s.nextInt();
						if(subject >= 1 && subject <= 3) {
							String selectSubject = 
									subject == 1 ? "JAVA" : subject == 2 ? "ORACLE" : "HTML";
							int score = 0;
							while(true) {
								System.out.print(selectSubject + " 점수 입력 : ");
								score = s.nextInt();
								if(score >= 0 && score <= 100) {
									break;
								} else {
									System.out.println("0~100 사이 입력하셈");
								}
							}
							sql = "UPDATE TBL_STUDENT SET "
									+ selectSubject + "=" + score
									+ " WHERE STU_NO = '" + stuNo + "'";
							
							int result = stmt.executeUpdate(sql);
							if(result > 0) {
								System.out.println("수정되었습니다");
							} else {
								System.out.println("실패 ㅋㅋ");
							}
						} else {
							System.out.println("1~3중에 선택해라");
						}
					} else {
						System.out.println("해당 학번 학생 없음");
					}
					break;
				default:
					break;
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
