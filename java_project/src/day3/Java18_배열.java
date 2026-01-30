package day3;

import java.util.Arrays;

public class Java18_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 2, 4, 1};
		
		int temp = arr[0];
		arr[0] = arr[2];  // {2, 5, 2, 4, 1}
		arr[2] = temp; // {2, 5, 3, 4, 1}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
