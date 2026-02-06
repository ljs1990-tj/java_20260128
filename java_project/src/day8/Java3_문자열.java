package day8;

import java.util.Scanner;

public class Java3_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		String c = "안녕?";
		String d = "안녕?";
		String e = new String("안녕?");
		System.out.println(c == d);
		System.out.println(d == e);
		System.out.println(d.equals(e));
		
		Scanner s = new Scanner(System.in);
		String f = s.next();
		System.out.println(c == f);
		System.out.println(c.equals(f));
		
		
	}
}
