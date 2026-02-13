package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java5_2차원배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4x4 크기의 정수형 배열을 생성해서
		// 1~16사이의 랜덤한 숫자를 넣기
		
		// 위에서 만든거에서 중복이 없이 넣는 코드로 변경
		Random ran = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		
		int arr[][] = new int[4][4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ran.nextInt(16)+1; 
				if(list.contains(arr[i][j])) {
					j--;
					continue;
				}
				list.add(arr[i][j]);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
