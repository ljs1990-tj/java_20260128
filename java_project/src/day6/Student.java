package day6;

import day5.Human;

public class Student extends Human{
	String stuNo;
	
	public Student(String name, int age, String stuNo){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}
	
	void study() {
		System.out.println(this.name + "가 공부를 합니다.");
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
}
