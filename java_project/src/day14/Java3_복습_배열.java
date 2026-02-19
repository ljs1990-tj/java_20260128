package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java3_복습_배열 {
	public static void main(String[] args) {
		
		// 랜덤한 숫자 1~10까지 arr 배열에 넣기.
		// 중복된 숫자 x
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			if(list.contains(arr[i])) {
				i--;
				continue;
			}
			list.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
