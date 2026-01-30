package day3;

import java.util.Scanner;

public class Java99_문제풀이 {
	public static void main(String[] args) {
		// 1. 사용자가 입력한 숫자의 구구단을 출력하시오.
		// 2~9사이의 값이 아니면 다시 입력하도록 하시오.
		Scanner s = new Scanner(System.in);
		
		for(;;) {
			System.out.print("구구단 단수를 입력해주세요 : ");
			int dan = s.nextInt();
			if(dan >= 2 && dan <= 9) {
				for(int i=1; i<=9; i++) {
					System.out.println(dan + "*" + i + "=" + (dan*i));
				}
				break;
			} else {
				System.out.println("2부터 9사이 값 입력하셈");
			}
			
			
		}
	}
}
