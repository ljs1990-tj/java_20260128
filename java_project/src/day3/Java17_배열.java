package day3;

import java.util.Arrays;
import java.util.Random;

public class Java17_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		Random ran = new Random();
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
