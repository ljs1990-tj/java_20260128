package day2;

public class Java6_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		 // a = a+1;
		// 증감연산자가 뒤에 있으면 먼저 값을 넣고 증감이 된다.
		int c = a++;
		System.out.println(c); // 10
		
		// 증감연산자가 앞에 있으면 먼저 증감을 먼저 하고 값을 넣는다.
		int d = ++b;
		System.out.println(d);
		
		int e = b--;
		System.out.println(e);
		System.out.println(b);
	}
}
