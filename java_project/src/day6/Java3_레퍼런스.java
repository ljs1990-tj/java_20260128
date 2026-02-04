package day6;

public class Java3_레퍼런스 {
	
	static void test1(String text) {
		
	}
	
	static void test2(Employee e) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "Hello";
		String a = new String("Hello");
		test1(a);
		
		Employee hong = new Employee("홍길동", 30, "인천", "남자", "1234");
		test2(hong);
	}

}
