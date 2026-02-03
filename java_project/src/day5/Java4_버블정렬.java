package day5;

import java.util.Arrays;

public class Java4_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 버블 정렬
		// 인접한 숫자끼리 비교해서 큰 숫자를 뒤로 보낸다.
		int arr[] = {2, 4, 5, 1, 3};
		
		// 1회차 {2, 4, 5, 1, 3} => {2, 4, 1, 3, 5}
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		// 2회차 {2, 4, 1, 3, 5} => {2, 1, 3, 4, 5}
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		// 3회차 {2, 1, 3, 4, 5} => {1, 2, 3, 4, 5}
		for(int i=0; i<arr.length-3; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		// 4회차 {1, 2, 3, 4, 5} => {1, 2, 3, 4, 5}
		for(int i=0; i<arr.length-4; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
