package day14;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java8_컬렉션 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Object> map = new HashMap<>();
		// 나이를 잘못 입력(ex 문자 입력)할 경우
		// 안내문구 후 나이만 다시 입력하도록
		System.out.print("이름 : ");
		String name = s.next();
		System.out.print("주소 : ");
		String addr = s.next();
		map.put("name", name);
		map.put("addr", addr);
		while(true) {
			try {
				System.out.print("나이 : ");
				int age = s.nextInt();
				map.put("age", age);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("나이에는 숫자를 입력하셈");
				s.next();
			}
		}
		
		System.out.println(map);
		
//		map.put("name", "홍길동");
//		map.put("addr", "인천");
//		map.put("age", 30);
//		System.out.println(map);
//		map.put("age", (Integer) map.get("age")+1);
//		System.out.println(map);
	}
}
