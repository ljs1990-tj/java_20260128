package day8;

import java.util.Scanner;

public class Java4_subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello Java";
//		String java = text.substring(6);
//		System.out.println(java);
		String hello = text.substring(0, 5);
		System.out.println(hello);
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String input = s.next(); // java
		for(int i=0; i<input.length(); i++) {
			input = input.substring(1) + input.substring(0,1); 
			System.out.println(input);
		}
		
	}

}
