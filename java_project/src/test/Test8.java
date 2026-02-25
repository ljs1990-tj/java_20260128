package test;

import java.util.Arrays;

public class Test8 {
	public static boolean sameNumberCounts(int[] arr1, int[] arr2) {
	    // 구현
		if(arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. (5점) 두 정수 배열이 주어졌을 때, 순서는 다르더라도 동일한 숫자들이 동일한 개수만큼 포함되어 있다면 true를 반환하는 메소드를 작성하시오
//		(파일명 : Test8.java)
		// 입력: [1, 2, 2, 3], [3, 2, 1, 2]
		// 출력: true
		// 입력: [1, 2, 2], [1, 2, 3]
		// 출력: false
		
		int arr1[] = {1, 2, 2, 3};
		int arr2[] = {3, 2, 1, 2};
		boolean result = sameNumberCounts(arr1, arr2);
		System.out.println(result);
	}

}
