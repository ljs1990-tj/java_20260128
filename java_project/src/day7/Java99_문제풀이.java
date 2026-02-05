package day7;

import java.util.Random;
import java.util.Scanner;

public class Java99_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			int count = 0;
			System.out.print("문제 수를 입력 : ");
			int num = s.nextInt();
			for(int i=0; i<num; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.print(x + " * " + y + " = ");
				int answer = s.nextInt();
				if(x*y == answer) {
					System.out.println("정답!");
					count++;
				} else {
					System.out.println("오답! 정답은 " + (x*y));
				}
			}
			System.out.println("총 " + num + "문제 중에 " + count + "개 정답!");
			System.out.print("계속 할래? 할거면 0 아니면 다른 숫자 입력 : ");
			if(s.nextInt() == 0) {
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}
}
