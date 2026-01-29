package day2;

public class Java4_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코딩에서는 사칙연산 외에도 나머지 연산(%)이 많이 활용된다.
		int a = 10;
		int b = a % 3;
		System.out.println(b);
		
		String name = "홍길동";
		int age = 30;
		// 문자와 다른 데이터 타입을 더하면 
		// 결과는 그냥 이어 붙이는 형태가 된다.
		System.out.println(name + age);
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
		System.out.println(name + "의 나이는 " + age + 1 + "살 입니다.");
		System.out.println(name + "의 나이는 " + (age + 1) + "살 입니다.");
		
		
		
	}

}
