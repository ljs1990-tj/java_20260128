package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Java99_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
//		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5]; // {0,0,0,0,0}
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			// 0 이하의 숫자인지 체크
			if(arr[i] < 1) {
				System.out.println("1이상의 숫자를 입력하셈");
				i--;
				continue;
			}
			
			// 중복값 여부 체크
			// {1,2,3,1,0}
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복된 값이 있습니다. 다시 입력 하셈");
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
//		7. 6번에서 정의한 배열에서 홀수들의 합과 짝수들이 합의 차이 구하기
		
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("차이 값 : " + Math.abs((oddSum - evenSum)));
		
		
	}

}
