package day6.classEx;

import java.util.Random;
import java.util.Scanner;

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
			arr[i] = ran.nextInt(last-first+1)+first;
		}
		
		return arr;
	}
	
	public int[] createArr(int size) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if(arr[i] < 1 || arr[i] > 30) {
				System.out.println("1부터 30사이 입력하셈");
				i--;
			}
		}
		
		return arr;
	}

	public int[] createPositiveArr(int[] arr) {
		// TODO Auto-generated method stub
		int size = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				size++;
			}
		}
		int newArr[] = new int[size];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				newArr[j++] = arr[i];
			}
		}
		return newArr;
	}

	public int[] createOddArr(int[] arr) {
		int size = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				size++; 
			}
		}
		int newArr[] = new int[size];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				newArr[j++] = arr[i];
			}
		}
		return newArr;
	}
	
	
	
}
