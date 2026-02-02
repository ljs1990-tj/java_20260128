package day4;

import java.util.Scanner;

public class Java7_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		for(int i=1; i<=input; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		// 문제 2. 
		int arr[] = {3, 5, 2, 4, 1};
		// ***
		// *****
		// **
		// ****
		// *
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<=arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
