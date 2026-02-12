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
			ResultSet rs = stmt.executeQuery("SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'");
			if(rs.next()) {
//				Integer.parseInt(rs.getString("COUNT"));
				int updateCnt = rs.getInt("COUNT") + count;
				String sql = "UPDATE TBL_FRUIT SET "
							+ "COUNT = " + updateCnt
							+ " WHERE NAME = '" + name + "'";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("개수가 추가되었습니다!");
				} else {
					System.out.println("추가에 실패했습니다.");
				}
			} else {
				System.out.print("가격 : ");
				int price = s.nextInt();
				
				String sql = "INSERT INTO TBL_FRUIT VALUES("
							+ "'" + name + "',"
							+ price + ","
							+ count + ")"
						;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			// 1. 과일 추가, 2. 과일 판매, 3. 가격 수정, 4. 과일 삭제. 5. 종료
			while(true) {
				System.out.print("[1.과일 추가, 2.과일 판매, 3.가격 수정, 4.과일 삭제, 5.종료] : ");
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
					
					break;
				case 5:
					
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
