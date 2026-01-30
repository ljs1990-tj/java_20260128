package day3;

import java.util.Scanner;

public class Java5_반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 무한루프
		// 문제. 입력되는 숫자를 모두 더하시오.
		// 단, -1을 입력하면 더한 값을 출력하고 종료하시오.
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int count = 1;
		while (true) {
			System.out.print(count + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if (num != -1) {
				sum += num; // sum = sum + num;
			} else {
				// -1 입력되었을 경우
				break;
			}
			count++;
		}
		System.out.println("숫자들의 합 : " + sum);
	}
}
