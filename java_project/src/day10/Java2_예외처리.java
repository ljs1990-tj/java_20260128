package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java2_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = 10;
		
//		try {
//			System.out.print("나누는 수를 입력 : ");
//			int divisor = s.nextInt();
//			System.out.println(number / divisor);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("0으로 나누지 마셈");
//			System.out.println(e.getMessage());
//		} catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.println("숫자 입력해라");
//		}
		
		try {
			System.out.print("나누는 수를 입력 : ");
			int divisor = s.nextInt();
			System.out.println(number / divisor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류 발생했음. 다시 시도하셈");
			System.out.println(e.getMessage());
		} 
		
		
	}

}
