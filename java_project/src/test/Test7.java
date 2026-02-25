package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test7 {
	static Scanner s = new Scanner(System.in);
	
	public static int checkNumber(String text) {
		while(true) {
			System.out.print(text);
			int number = s.nextInt();
			if(number < 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				return number;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. (5점) 이미지와 동일하게 동작하도록 코드를 작성하시오. 
//		단, 데이터 관리는 ArrayList와 HashMap을 이용해서 할 것.
//
//		참고 1. 1번 메뉴에서 동일 이름을 다시 등록 시도할 경우 이미지와 같이 안내문구 띄울 것
//		참고 2. 2~4번 메뉴에서 등록되지 않은 이름을 찾을 경우 이미지와 같이 안내문구 띄울 것
//		참고 3. 모든 숫자는 음수 입력 불가능하도록 할 것
//		참고 4. 포인트 차감은 내가 가진 포인트를 초과해서 차감할 수 없음
//		(파일명 : Test7.java)
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("====== 포인트 관리 프로그램 ======");
		while(true) {
			System.out.print("[ (1)등록, (2)적립, (3)차감, (4)확인, (5)종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> user = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = true;
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))) {
						System.out.println("이미 등록된 사용자입니다.");
						flg = false;
						break;
					}
				}
				if(flg) {
					int age = checkNumber("나이 : ");
					user.put("name", name);
					user.put("age", age);
					user.put("point", 0);
					list.add(user);
					System.out.println(list);
				}
				
			} else if(menu == 2) {
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = true;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						// 
						int point = checkNumber("적립할 포인트 : ");
						user.put("point", (int) user.get("point") + point);
						flg = false;
						break;
					}
				}
				if(flg) {
					System.out.println("없는 사용자!!!!!!!!!!");
				}
			} else if(menu == 3) {
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = true;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						// 
						flg = false;
						int point = checkNumber("차감할 포인트 : ");
						if((int) user.get("point") < point) {
							System.out.println("차감할 수 있는 포인트는 " + user.get("point") + "입니다.");
							break;
						}
						user.put("point", (int) user.get("point") - point);
						System.out.println(list);
						break;
					}
				}
				if(flg) {
					System.out.println("없는 사용자!!!!!!!!!!");
				}
				
			} else if(menu == 4) {
				System.out.print("이름 : ");
				String name = s.next();
				boolean flg = true;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.println(user.get("name") + "님의 현재 포인트는 " + user.get("point") + " 입니다.");
						break;
					}
				}
				if(flg) {
					System.out.println("없는 사용자!!!!!!!!!!");
				}
			} else if(menu == 5) {
				System.out.println("종료됨");
				break;
			} else {
				System.out.println("1~5중에 선택하셈");
			}
		}
	}

}
