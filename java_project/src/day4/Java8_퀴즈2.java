package day4;

import java.util.Arrays;
import java.util.Random;

public class Java8_퀴즈2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 랜덤한 숫자 10개를 arr 배열에 넣기
		// * 랜덤한 숫자의 범위는 1~20
		// * 홀수와 짝수의 개수는 무조건 5개씩
		Random ran = new Random();
		int arr[] = new int[10];
		int oddCnt = 0;
		int evenCnt = 0;
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(20)+1;
			if(random % 2 == 1) {
				if(oddCnt == 5) {
					i--;
					continue;
				}
				oddCnt++;
			} else {
				if(evenCnt == 5) {
					i--;
					continue;
				}
				evenCnt++;
			}
			arr[i] = random;
		}
		System.out.println("oddCnt => " + oddCnt);
		System.out.println("evenCnt => " + evenCnt);
		System.out.println(Arrays.toString(arr));
	}
}
