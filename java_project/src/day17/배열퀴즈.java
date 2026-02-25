package day17;

import java.util.Arrays;

public class 배열퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에서 두번째로 큰 값 찾기. 배열에는 중복된 숫자가 없다고 가정
		int arr[] = {3, 5, 2, 9, 4};
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[arr2.length-2]);
		
	}
}
