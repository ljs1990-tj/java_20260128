package day4;

public class Java2_복습_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// int arr[] = new int[5];
//		arr[0] = "문자열"; // int형 데이터만 가능
		arr[0] = 10;
		
		String[] textArr = {"java", "oracle", "javascript", "html"};
//		Object[] test = {"z", 1, 1.5, true};
//		for(int i=0; i<textArr.length; i++) {
//			System.out.println(textArr[i]);
//		}
		
		for(String txt : textArr) {
			System.out.println(txt.length());
		}
		
	}
}
