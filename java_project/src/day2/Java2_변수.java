package day2;

public class Java2_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수는 언제든 값이 변경될 수 있다.
		double height = 170.5;
		height = 170.5 + 1; // 171.5
		
		// final키워드를 붙이면 값을 변경할 수 없다.
		// final 변수는 모두 대문자로, '상수' 라고 표현
		final double PI = 3.14;
//		PI = 3.141592; final이므로 수정할 수 없다.
		
		int number = 50;
		int number2 = number + 10;
		
		int weight = 50; // 50.0
		double weight2 = weight;
		
		// double이 더 큰 개념이므로 int에 담는거는 원래는 불가능
		// 다만, 강제형변환을 통해서 가능하게 할 수 있음
		// 이때, 값의 손실이 발생한다.
		double weight3 = 50.5;
		int weight4 = (int) weight3;
		System.out.println(weight4);
		
	}
}
