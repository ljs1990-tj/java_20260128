package day2;

public class Java3_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수학에서 사용하는 사칙연산(+,-,*,/) 사용
		
		int a = 10;
		int b = 5;
		int c = 13;
		System.out.println(a + b); // 15
		System.out.println(c - b); // 8
		System.out.println(a * c); // 130
		
		// int와 int의 계산이므로 결과도 int(나머지 값 사라짐)
		System.out.println(c / b);
		
		// 사칙연산의 결과는 더 큰 데이터 타입을 따른다.
		double d = 13;
		// int와 double의 계산이므로 결과가 double
		System.out.println(d / b);
		System.out.println((double)c / b);
	}
}
