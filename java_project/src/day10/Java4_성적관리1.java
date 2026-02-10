package day10;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java4_성적관리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		// 3명의 학생을 list에 추가
		// 학번, 이름, 나이를 입력받아서 Student 객체로 만들고 list에 추가
		try {
			for(int i=0; i<3; i++) {
				System.out.print("학번 : ");
				String stuNo = s.next();
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				
				Student stu = new Student(stuNo, name, age);
				list.add(stu);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자 입력하셈");
			s.next();
		}
		
		
		System.out.println(list);
	}
}
