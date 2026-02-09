package day9;

import java.util.HashMap;

public class Java2_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("java", 90);
		hong.put("oracle", 95);
		hong.put("html", 85);
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("java", 95);
		kim.put("oracle", 90);
		kim.put("html", 90);
		
		System.out.println(kim);
		
	}

}
