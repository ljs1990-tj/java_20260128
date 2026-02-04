package day6.classEx;

import java.util.Arrays;

public class Java1_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 10, 5, 9, 2};
		ArrayFunc func = new ArrayFunc();
		int max = func.max(arr);
		System.out.println(max); // 10
		
		int sum = func.arrSum(arr);
		System.out.println(sum); // 배열의 모든 수의 합
		
		// 5개의 공간을 가지는 배열 생성 후 
		// 랜덤한 숫자(1~20) 5개 넣기
		int ranArr[] = func.createRanArr(5, 1, 20);
		// (5, 20, 40)
		System.out.println(Arrays.toString(ranArr));
		
	}
}
