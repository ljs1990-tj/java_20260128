package day9;

import java.util.HashMap;

public class Java10_복습_맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("java", 90);
//		map.put("name", "홍길동"); 문자열 불가!
		
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.5);
		hong.put("isMarried", true);
		
//		hong.put("height", 169.5);
		hong.put("height", (double) hong.get("height") - 1);
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		
	}
}
