package day2;

import java.util.Scanner;

public class Java14_조건문퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자를 1개 입력받아서
		// 홀수면 '홀수 입니다.', 짝수면 '짝수 입니다.' 출력
		// 다만, 1~100사이 값이 아니면
		// '1부터 100사이의 값을 입력해주세요' 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = s.nextInt();
		if(num < 1 || num > 100) {
			System.out.println("1부터 100사이의 값을 입력해주세요");
		} else if(num % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}
}
