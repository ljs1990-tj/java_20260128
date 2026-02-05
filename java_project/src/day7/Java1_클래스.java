package day7;

public class Java1_클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator.sum(1, 2); // 객체 생성 후 사용 가능
		Calculator c = new Calculator("아주좋은 계산기", 100000, "검은색");
		int num = c.sum(3, 5);
		System.out.println(num);
		
		int arr[] = {1,3,2,4,5};
		int sum = c.sum(arr);
		System.out.println(sum);
		
		System.out.println(c.getName());
		
		Person hong = new Person("홍길동", 30);
		hong.setPhone("123-123");
	}
}
