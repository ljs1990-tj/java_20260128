package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java6_과일가게 {
	public static void addFruit(Statement stmt) {
		Scanner s = new Scanner(System.in);
		try {
			// 과일 이름, 개수, 가격 입력받아서 DB(TBL_FRUIT)에 저장
			// 과일 이름이 이미 있는 경우 개수만 입력받아서 기존거에 더해주기
			System.out.print("과일 이름 : ");
			String name = s.next();
			System.out.print("개수 : ");
			int count = s.nextInt();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '"+ name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				sql = "UPDATE TBL_FRUIT SET "
						+ "COUNT = " + (rs.getInt("COUNT") + count)
						+ " WHERE NAME = '" + name + "'";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("개수가 추가되었습니다!");
				}
			} else {
				// INSERT(이름, 개수, 가격)
				System.out.print("가격 : ");
				int price = s.nextInt();
				sql = "INSERT INTO TBL_FRUIT VALUES("
						+ "'" + name + "',"
						+ price + ","
						+ count + ")";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("추가되었습니다!");
				}
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	// 삭제
	public static void removeFruit(Statement stmt) {
		try {
			// 과일 이름 입력받고 삭제하기
			// 과일 이름이 db에 있으면 정말 삭제할지 한번 더 물어 보고('Y', 'N') 삭제
			// 대소문자 구분 없이 Y(y)하면 삭제, N(n)하면 메뉴로 이동
			// 그 외 문자 입력 시 ''Y, 'N' 중에 선택 하셈' 출력 후 다시 입력하도록
			// 과일 이름 없으면 '해당 과일은 존재하지 않습니다' 출력 후 메뉴로
			Scanner s = new Scanner(System.in);
			System.out.print("과일 이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '"+ name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				while(true) {
					System.out.print("정말 삭제 하실(y/n)? ");
					String confirm = s.next();
					if(confirm.toUpperCase().equals("Y")) {
						sql = "DELETE FROM TBL_FRUIT WHERE NAME = '" + name + "'";
						int result = stmt.executeUpdate(sql);
						if(result > 0) {
							System.out.println("삭제 되었음!");
							return;
						}
					} else if(confirm.toUpperCase().equals("N")) {
						return;
					} else {
						System.out.println("y/n 중 선택해라");
					}
				}
			} else {
				System.out.println("해당 과일은 존재하지 않습니다");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void searchFruit(Statement stmt) {
		try {
//			String sql = "SELECT * FROM TBL_FRUIT";
//			ResultSet rs = stmt.executeQuery(sql);
			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
//			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
//			
//			rs.next();
//			System.out.print(rs.getString("NAME") + " | ");
//			System.out.print(rs.getInt("PRICE") + " | ");
//			System.out.println(rs.getInt("COUNT"));
			
//			while(rs.next()) {
//				System.out.print(rs.getString("NAME") + " | ");
//				System.out.print(rs.getInt("PRICE") + " | ");
//				System.out.println(rs.getInt("COUNT"));
//			}
		
			Scanner s = new Scanner(System.in);
			System.out.print("과일 이름 : ");
			String name = s.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '"+ name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.print(rs.getString("NAME") + " | ");
				System.out.print(rs.getInt("PRICE") + " | ");
				System.out.println(rs.getInt("COUNT"));
			} else {
				System.out.println("해당 이름의 과일 없음!");
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
		
		try {
			// 1. 과일 추가, 2. 과일 판매, 3. 가격 수정, 4. 과일 삭제. 5. 종료
			while(true) {
				// select-search, update-edit, delete-remove, insert-add
				System.out.print("[1.과일 추가, 2.과일 판매, 3.가격 수정, 4.과일 삭제, 5.과일 확인] : ");
				int menu = s.nextInt();
				switch (menu) {
				case 1:
					addFruit(stmt);
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					removeFruit(stmt);
					break;
				case 5:
					searchFruit(stmt);
					break;
				default:
					System.out.println("1~5 사이 메뉴 선택하세요.");
					break;
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
