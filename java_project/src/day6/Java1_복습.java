package day6;

import java.util.Random;
import java.util.Scanner;

import day5.Student;

public class Java1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		Student hong = new Student("홍길동", 30, "1234");
//		hong.stuNo = "9876";
		hong.setStuNo("9876");
		hong.setAddr("인천");
		
	}
}
