package day17;

import java.util.ArrayList;
import java.util.Random;

public class 리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> menuList = new ArrayList<>();
		menuList.add("볶음밥");
		menuList.add("햄버거");
		menuList.add("김치찌개");
		menuList.add("라면+김밥");
		menuList.add("짜장면");
		
		
		// 랜덤으로 한개 추천
		Random ran = new Random();
		int ranNum = ran.nextInt(menuList.size());
		System.out.println(menuList.get(ranNum));
		
		menuList.clear();
		System.out.println(menuList);
		
	}
}
