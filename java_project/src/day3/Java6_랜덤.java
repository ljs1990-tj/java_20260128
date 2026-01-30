package day3;

import java.util.Random;
import java.util.Scanner;

public class Java6_랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
//		int a = ran.nextInt(10); // 0~9
//		int b = ran.nextInt(10)+1; // 1~10
//		System.out.println(b);
		
		int x = ran.nextInt(8)+2; // 2~9
		int y = ran.nextInt(9)+1; // 1~9
		
		System.out.print(x + " * " + y + " = ");
		int answer = s.nextInt();
		if(x*y == answer) {
			System.out.println("정답!");
		} else {
			System.out.println("오답!");
		}
		
	}
}
