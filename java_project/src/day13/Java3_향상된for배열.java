package day13;

public class Java3_향상된for배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
		
		for(int num : arr) {
			sum += num;
		}
		
		
	}

}
