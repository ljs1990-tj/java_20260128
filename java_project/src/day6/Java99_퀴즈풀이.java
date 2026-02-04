package day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java99_퀴즈풀이 {
	public static void main(String[] args) {
//		2. 스캐너를 통해 숫자를 입력받은 후 
//		홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
//		단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		if(!(input < 0 || input > 10)) {
//			// input > 0 && input <= 10
//			if(input % 2 == 0) {
//				System.out.println("짝수");
//			} else {
//				System.out.println("홀수");
//			}
//		} else {
//			System.out.println("1부터 10 사이 입력하셈");
//		}
//
//		3. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 역순으로 출력하시오.
//		(ex, 2입력시 2*9=18, 2*8=16, 2*7=14 ... 2*1=2 출력)
//		System.out.print("숫자 입력 : ");
//		int input = s.nextInt();
//		for(int i=9; i>0; i--) {
//			System.out.println(input + "*" + i + "=" + (input * i));
//		}
//
//		4. 구구단을 출력하시오. 
//		단, 5단과 8단은 제외하고 출력
//		for(int i=2; i<=9; i++) {
//			if(i == 5 || i == 8) {
//				continue;
//			}
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + "*" + j + "=" + (i * j));
//			}
//		}
		
		
//		[배열 공통 문제]
//		배열 : {3, 7, 10, 6, 15, 2}
//		5. 위 배열을 선언하고 배열 내에 있는 모든 숫자들의 합과 평균을 출력하시오.
//		6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
		int arr[] = {3, 7, 10, 6, 15, 2};
		int evenIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				if(arr[evenIndex] < arr[i]) {
					evenIndex = i;
				}
			}
			
		}
		System.out.println(evenIndex);
//		int arr[] = {3, 7, 10, 6, 15, 2};
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println((double) sum / arr.length);
//
//		7. 5개의 공간을 가지는 배열을 선언하고,
//		Random 클래스를 이용해 구한 랜덤한 숫자 1~30 사이의 숫자 5개를 배열에 넣으시오.
//		단, 홀수만 넣을 것.
		Random ran = new Random();
//		int arr[] = new int[5];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(30)+1;
//			if(arr[i] % 2 == 0) {
//				i--;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
	}
}
