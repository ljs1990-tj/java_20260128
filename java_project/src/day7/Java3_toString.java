package day7;

import java.util.HashMap;

public class Java3_toString {
	static void test(Object obj) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30);
		Person hong2 = new Person("홍길동", 30);
		
		String a = new String("test");
		String b = new String("test");
		
		System.out.println(hong == hong2);
		System.out.println(hong.equals(hong2));
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
//		System.out.println(hong.toString());
		System.out.println(hong);
		
		String str = new String("zz");
		System.out.println(str.toString());
		
	}
}
