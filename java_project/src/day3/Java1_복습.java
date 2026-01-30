package day3;

public class Java1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		System.out.println(a / b); // 3
		double c = 3;
		System.out.println(a / c); // 3.333.....
		
		System.out.println((double) a / b); // 3.333....
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name + "의 나이는 " + age);

		int num = 10;
//		num = num + 3;
		num += 3;
		
		int x = 10;
		int y = x++;
		int z = --x;
		// x = 10, y = 10, z = 10
		
		System.out.println(x > y); // false
		System.out.println(x >= y); // true
		System.out.println(z > 5);
		
		System.out.println(x == z); // true
		System.out.println(x != z); // false
		
		System.out.println(x > 5 && y > 8); // true
		System.out.println(x > 15 || y > 8); // true
		
	}
}
