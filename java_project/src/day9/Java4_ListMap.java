package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java4_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3명의 사람 정보를 입력받아서 리스트 안에 저장
		// 이름, 나이, 자바 점수
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=0; i<2; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
			
			System.out.print("자바 : ");
			int java = s.nextInt();
			map.put("java", java);
			
			list.add(map);
			
		}
		System.out.println(list);
		
		// 자바점수가 60점 미만이면 60점으로 변경
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if((int) user.get("java") < 60) {
				user.put("java", 60);
			}
		}
		System.out.println(list);
	}
}
