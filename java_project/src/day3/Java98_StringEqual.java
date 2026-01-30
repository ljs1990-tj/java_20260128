package day3;

import java.util.Scanner;

public class Java98_StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 비교는 equals 메소드를 사용해야 한다.
		Scanner s = new Scanner(System.in);
		String menu = s.next();
		if(menu.equals("Y")) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
	}
}
