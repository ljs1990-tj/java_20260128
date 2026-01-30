package day3;

import java.util.Random;
import java.util.Scanner;

public class Java7_랜덤구구단 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		// 5문제 다 푼 후
		// 몇문제를 맞췄는지 알림
		// '총 oo문제 맞추셨습니다' 출력
		int count = 0; // 정답 개수 체크
		for(int i=1; i<=5; i++) {
			int x = ran.nextInt(8)+2; // 2~9
			int y = ran.nextInt(9)+1; // 1~9
			System.out.print("[" + i + "번 문제] ");
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();
			if(x*y == answer) {
				System.out.println("정답!!!");
				count++;
			} else {
				System.out.println("오답!!!");
			}
		}
		System.out.println("총 " + count + "문제 맞추셨습니다.");
	}
}
