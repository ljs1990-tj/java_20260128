package day1;

public class Java3_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ;
		name = "홍길동";
		System.out.println(name);
		
		// 변수안에 들어간 값은 언제든 바꿀 수 있습니다.
		String hobby = "영화감상";
		System.out.println(hobby); // 영화감상 출력
		
		hobby = "코딩";
		System.out.println(hobby); // 코딩 출력
		
		// 변수 선언은 한번만 가능
		int age = 30;
		
//		int age = 31;
		age = 31;
	}
}
