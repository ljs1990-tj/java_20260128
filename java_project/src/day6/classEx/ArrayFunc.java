package day6.classEx;

import java.util.Random;

public class ArrayFunc {
	public int max(int[] arr) {
		
		int max = arr[0];
		// {3, 10, 5, 9, 2}
		for(int i=1; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	
	public int arrSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int[] createRanArr(int size, int first, int last) {
		int arr[] = new int[size];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(20)+1;
		}
		
		return arr;
	}
}
