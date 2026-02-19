package day14;

public class Java1_복습_연산자 {

	public static boolean test(int a) {
		if(a % 2 == 0) {
			System.out.println("두번째 숫자는 짝수다!");
		} else {
			System.out.println("두번째 숫자는 홀수다!");
		}
		return a >= 5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and, or
		
		int a = 10;
		int b = 5;
		
//		boolean c =  test(99);
		
		if(a >= 20 & test(5)) {
			System.out.println(true); 
		}
		
	}

}
