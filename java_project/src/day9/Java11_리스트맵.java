package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java11_리스트맵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<>(); // []
		
		HashMap<String, Object> hong = new HashMap<>(); // abcd
		list.add(hong); //[{name=홍길동, age=30}] => [abcd]
		hong.put("name", "홍길동");
		hong.put("age", 30);
		
		HashMap<String, Object> map = list.get(0);
		map.put("age", 31);
		
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("addr", "인천");
		list.add(kim);
		System.out.println(list);
		
	}
}
