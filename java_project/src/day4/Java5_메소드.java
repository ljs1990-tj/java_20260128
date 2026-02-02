package day4;

public class Java5_메소드 {

	static void method1() {
		// 리턴이 없는 메소드(메소드는 단순히 호출하고 끝나는 형태).
		System.out.println("첫번째 메소드 호출!!");
	}
	
	static int method2() {
		// 리턴이 있는 메소드(결과를 되돌려주는 형태)
		return 100;
	}
	
	static int sum(int a, int b) {
//		int c = a+b;
//		return c;
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드는 단순히 호출하고 끝나는 형태
		// 결과를 되돌려주는 형태
		
		method1(); // method1 호출
		int value = method2(); // 100을 되돌려 받는다
		System.out.println(value);
		
		int result = sum(3, 5); // 괄호안에 있는 2개 숫자를 더해서 리턴받고 싶다!
		System.out.println(result);
		
		int result2 = sum(100, 200);
		System.out.println(result2);
		
	}
}
