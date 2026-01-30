package day3;

public class Java14_배열퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가장 큰 숫자의 위치 값(index) 찾기
		int[] arr = {5, 3, 8, 4, 2};
		
		int maxIndex = 0; // 큰 숫자 위치 백업
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
		
		
		
	}
}
