package day14;

import java.util.Arrays;

import day5.Human;

public class Java2_복습_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,2,4,1};
		int arr2[] = new int[5]; // {0,0,0,0,0}
//		Human h[] = new Human[5]; // {null, null, null, null, null}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		// [5,4,3,2,1] , [1,2,3,4,5]
		// 배열에는 중복된 숫자가 없다고 가정하고 풀이
		// arr 배열에서 두번째로 큰 숫자 찾아서 출력
		
		Arrays.sort(arr); // [1,2,3,4,5]
		System.out.println(arr[arr.length-2]);
		
		
	}
}
