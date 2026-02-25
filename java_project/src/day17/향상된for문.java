package day17;

public class 향상된for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,2,9,4,8,7};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		String arr2[] = {"java", "oracale", "html"};
		for(String subject : arr2) {
			System.out.println(subject);
		}
	}

}
