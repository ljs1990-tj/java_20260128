package day2;

public class Java9_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// and(&&), or(||)
		// and => 둘 다 만족(true)했을 때 true
		// or => 둘 중 하나라도 만족(true)하면 true
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		
		int a = 10;
		int b = 5;
		System.out.println(a > b && a > 10); // false
		System.out.println(b > 8 || a > 8); // true
		System.out.println(a >= 10 && b > 3); // true
		
		
		
		System.out.println(a >= 10 || b > 3);
	}
}
