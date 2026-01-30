package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random = ran.nextInt(100)+1; // 1~100
		int count = 1; // 시도 횟수
		while(true) {
			System.out.print(count + "번째 시도 : ");
			int answer = s.nextInt();
			
			if(!(answer >= 1 && answer <= 100)) { 
				// if(answer < 1 || answer > 100)
				System.out.println("1~100 사이 값을 입력해주세요.");
			} else if(random > answer) {
				System.out.println("UP!"); 
				count++;
			} else if(random < answer) {
				System.out.println("DOWN!");
				count++;
			} else {
				System.out.println("정답입니다! " + count + "번째만에 맞추셨습니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}
}
