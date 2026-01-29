package day2;

import java.util.Scanner;

public class Java10_스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// import 자동 => Ctrl + Shift + o(알파벳)
		// 값을 입력받기 위한 용도로 스캐너 사용
		Scanner s = new Scanner(System.in);
//		s.next(); => 문자를 입력받는 기능
//		s.nextInt(); => 숫자(정수)를 입력받는 기능
		System.out.print("숫자를 입력해주세요 : ");
		int input = s.nextInt();
		System.out.println(input >= 10);
		
		System.out.println("== 프로그램 종료 ==");
	}
}
