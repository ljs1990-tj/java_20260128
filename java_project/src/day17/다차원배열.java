package day17;

import java.util.Arrays;
import java.util.Random;

public class 다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][5];
//		for(int i=0; i<arr[0].length; i++) {
//			arr[0][i] = i+1;
//		}
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10)+1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// 합의 결과가 모두 다르다고 가정
		int index = 0;
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			if(max < sum) {
				max = sum;
				index = i;
			}
		}
		System.out.println(Arrays.toString(arr[index]));
	
		
	}
}
