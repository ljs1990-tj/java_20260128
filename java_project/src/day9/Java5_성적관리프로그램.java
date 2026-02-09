package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java5_성적관리프로그램 {
	static Scanner s = new Scanner(System.in);
	public static int inputNumber(int first, int last) {
		int result = 0;
		while(true) {
			result = s.nextInt();
			if(result < first || result > last) {
				System.out.print(first + "~" + last + "사이 값을 다시 입력해주세요 : ");
			} else {
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == [1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료] == 
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			
			System.out.print("[1. 학생 추가, 2. 성적 입력, 3. 성적 확인, 4. 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 학생 추가 ( 
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("나이 : ");
				int age = inputNumber(1, 150);
				map.put("age", age);
				
				list.add(map);
				
			} else if(menu == 2) {
				// 성적 입력 ( java, oracle, html )
				System.out.print("성적을 입력할 학생의 이름을 입력 : ");
				String name = s.next();
				boolean studentFlg = false;
				for(int i=0; i<list.size(); i++) {
//					if(list.get(i).get("name").equals(name)) {
//					}
					HashMap<String, Object> student = list.get(i); 
					if(student.get("name").equals(name)) {
						studentFlg = true;
						System.out.print("자바 : ");
						int java = inputNumber(0, 30);
						student.put("java", java);
						
						System.out.print("오라클 : ");
						student.put("oracle", inputNumber(0, 50));
						
						System.out.print("html : ");
						student.put("html", inputNumber(0, 20));
						
						break;
					} 
				}
				if(!studentFlg) {
					System.out.println("해당 이름 학생 없습니다.");
				}
			} else if(menu == 3) {
				// 성적 확인
				// 1. 이름 입력 받기
				// 2. 해당 이름을 가진 map이 없으면 '해당 이름 학생 없습니다.'
				// 3. 있으면 'ooo의 점수 => 자바 : oo, 오라클 : oo, html : oo' 출력 
				System.out.print("성적을 확인할 학생의 이름을 입력 : ");
				String name = s.next();
				boolean studentFlg = false;
				
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> student =  list.get(i);
					if(student.get("name").equals(name)) {
						// 학생 이름은 있지만, 점수를 입력되지 않았을 때 로직 처리
						studentFlg = true;
						if(!student.containsKey("java")) {
							System.out.println("성적 점수가 입력되지 않았습니다.");
							break;
						}
						System.out.print(name + "의 점수 => ");
						System.out.print("자바 : " + student.get("java") + ", ");
						System.out.print("오라클 : " + student.get("oracle") + ", ");
						System.out.println("html : " + student.get("html"));
						break;
					}
				}
				if(!studentFlg) {
					System.out.println("해당 이름 학생 없습니다.");
				}
			} else if(menu == 4) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4중에 하나를 선택해주세요.");
			}
			
			
		}
	}
}
