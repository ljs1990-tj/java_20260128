package day8;

import java.util.Random;
import java.util.Scanner;

public class Java98_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				// 구구단 풀기
				while(true) {
					System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
					menu = s.nextInt();
					if(menu >= 1 && menu <= 3) {
						// 구구단 시작
						int count = 0;
						for(int i=1; i<=5; i++) {
							int x;
							if(menu == 1) {
								x = ran.nextInt(4)+2; // 2~5
							} else if(menu == 2) {
								x = ran.nextInt(4)+6; // 6~9
							} else {
								x = ran.nextInt(8)+12; // 12~19
							}
							int y = ran.nextInt(9)+1;
							System.out.print(i + "번 " + x + " * " + y + " = ");
							int answer = s.nextInt();
							if(answer == x*y) {
								System.out.println("정답!");
								count++;
							} else {
								System.out.println("땡! 정답은 " + (x*y) + " 입니다.");
							}
						}
						System.out.println("총 " + count + "개 맞추셨습니다.");
						break;
					} else {
						System.out.println("난이도 1~3중에 선택하셈");
					}
				}
				
				
			} else if(menu == 2) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
			} else {
				// 다시 입력
				System.out.println("1~2중에 선택하셈");
			}
		}
		
	}

}
