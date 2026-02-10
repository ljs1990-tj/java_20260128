package day10;

import java.util.ArrayList;

public class Java3_리스트_객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		
		Student hong = new Student("1234", "홍길동", 30);
		hong.setJava(90);
		
		Student kim = new Student("9876", "김철수", 25);
		kim.setJava(95);
		
		list.add(hong);
		list.add(kim);
		System.out.println(list);
		
	}

}
