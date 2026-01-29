package day2;

import java.util.Scanner;

public class Java12_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int input = s.nextInt();
		int a = 10;
		
		// if문을 이용해서 입력받은 값이 a보다 크면
		// '입력한 값이 a 보다 큽니다.' 출력
		if(input > a) {
			// 조건을 만족했을 때
			System.out.println("입력한 값이 a 보다 큽니다.");
		} else {
			// 조건을 만족하지 않았을 때
			System.out.println("입력한 값이 a 보다 작거나 같습니다.");
		}
		
	}
}
