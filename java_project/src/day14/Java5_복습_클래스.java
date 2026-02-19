package day14;

import java.util.Arrays;

public class Java5_복습_클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = Function.max(3, 5);
		System.out.println(max); // 5
		
		Function func = new Function(); // 'Function 객체를 생성했습니다.'
		int min = func.min(3, 5);
		System.out.println(min); // 3
		
		int ran = Function.random(10);
		System.out.println(ran); // 1부터 10(인자 값)사이의 랜덤한 값 출력
		
		int arr[] = {3, 5, -4, 10, -9};
		int sum = Function.sum(arr);
		System.out.println(sum); // 배열안에 있는 모든 숫자의 합 (5)
		
		// 음수, 양수 상관없이 내림차순
		// {-10, -9, -5, -4, -3}
		Function.sort(arr);
		System.out.println(Arrays.toString(arr)); // {10, -9, 5, -4, 3}
		
//		int arr2[] = Function.sort(arr);
//		System.out.println(Arrays.toString(arr2));// {10, -9, 5, -4, 3}
	}
}
