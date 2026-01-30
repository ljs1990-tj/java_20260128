package day3;

public class Java13_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 8, 4, 2};
		int max = arr[0]; // 큰 숫자 백업
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
