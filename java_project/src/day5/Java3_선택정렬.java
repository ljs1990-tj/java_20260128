package day5;

import java.util.Arrays;

public class Java3_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 5, 1, 4};
		// 내림차순
		for(int i=0; i<arr.length-1; i++) {
			int maxIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));
			
		}
	}
}
