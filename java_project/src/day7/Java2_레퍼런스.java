package day7;

import java.util.Arrays;

public class Java2_레퍼런스 {
	static void varMethod(int x) {
		x += 10000;
	}
	static void refMethod(Person p) {
		p.setPhone("1234-5678");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		varMethod(a);
		System.out.println(a); // 10
		
		int b = 30;
		int c = b;
		b = 10000;
		System.out.println(c); // 30
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = arr1;
		arr1[0] = 10000;
		System.out.println(arr2[0]); // 10000
		
		Person p = new Person("홍길동", 30);
		refMethod(p);
		System.out.println(p.getPhone());
		
		int arr[] = {3, 2, 5, 9, 6};
		ArrayFunc.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
