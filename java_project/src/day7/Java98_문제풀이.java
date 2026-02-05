package day7;

import java.util.Arrays;
import java.util.Random;

public class Java98_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~30 사이 숫자를 10개의 공간을 가지는 배열에 넣기
		Random ran = new Random();
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int oddArr[]; // 홀수들 {17,1,9,17}
		int evenArr[]; // 짝수들 {14,28,28,6,14,10}
	}

}
