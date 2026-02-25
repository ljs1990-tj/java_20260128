package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. (10점) 20개의 공간을 가지는 배열을 생성하고, 랜덤한 숫자 1~20사이의 값을 20개의 공간에 모두 넣으시오.
//		단, 중복된 숫자는 최대 3개까지만 허용하며, 작업이 끝난 후 한번도 나오지 않는 숫자 목록을 출력할 것.
//		(파일명 : Test6.java)
//		결과 : '배열에 없는 숫자 :  o o o '
		Random ran = new Random();
		HashMap<Integer, Integer> map = new HashMap<>();
		int arr[] = new int[20];
		for(int i=1; i<=arr.length; i++) {
			map.put(i, 0);
		}
		
		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(20)+1;
			if(map.get(ranNum) > 2) {
				i--;
				continue;
			}
			map.put(ranNum, map.get(ranNum)+1);
			arr[i] = ranNum;
		}
		
		System.out.print("배열에 없는 숫자 : ");
		for(int i=1; i<=arr.length; i++) {
			if(map.get(i) == 0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
	}
}
