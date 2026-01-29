package day2;

import java.util.Scanner;

public class Java24_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 숫자의 구구단을 출력하시오.
		// 2~9사이의 값이 아니면 다시 입력하도록 하시오.
		
		Scanner s = new Scanner(System.in);
		for(;;) {
			System.out.print("구구단 단수를 입력해주세요 : ");
			int num = s.nextInt();
			
			if(num >= 2 && num <= 9) {
				System.out.println("===== " + num + "단 =====");
				for(int i=1; i<=9; i++) {
					System.out.println(num + " * " + i + " = " + (num*i));
				}
				break;
			} else {
				System.out.println("2~9 사이의 값을 입력해주세요.");
			}
		}
		System.out.println("=== 프로그램이 종료되었습니다. ==="); 
		
		
	}

}
